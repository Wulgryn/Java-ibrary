package Wulgryn.Net.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import Wulgryn.IO.FileManager;
import Wulgryn.Properties.Common;

public class TcpClient {
    private Socket socket;

    private DataInputStream in;
    private DataOutputStream out;

    private boolean run = true;

    public TcpClient(String ip, int port)
    {
        try {
            socket = new Socket(ip,port);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void Start()
    {
        try {
            socket.setReceiveBufferSize(16);
            socket.setSendBufferSize(16);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            new Thread(){
                public void run() {
                    long last = 0;
                    while(run){
                        Common.Wait(1);
                            last = System.currentTimeMillis();
                            ReadMSG();
                        System.out.println("Client stopped.");
                    }
                };
            }.start();
        } catch (Exception e) {}
    }

    public void SetResceiveBufferSize(int size)
    {
        try {
            socket.setReceiveBufferSize(size);
        } catch (SocketException e) {}
    }

    private String cmd = "";
    private String FileProperties;

    private String msg = "";

    private void ReadMSG()
    {
        try {
            //if(in.available() > 0)
            //{
                if(cmd == "FILE")
                {
                    FileManager.WriteBytes(FileProperties, in.readAllBytes());
                    SetResceiveBufferSize(16);
                    socket.setSendBufferSize(16);
                    cmd = "";
                    return;
                }
                String[] Data = new String(in.readAllBytes()).split(" ");
                switch(Data[0])
                {
                    case "MSG":
                    {
                        ArrayList<String> s = 
                        (ArrayList<String>) Arrays.asList(Data)
                        .stream()
                        .skip(1)
                        .collect(Collectors.toList());
                        msg = String.join(" ",s);
                    };
                    case "FILE":
                    {
                        SetResceiveBufferSize(Integer.parseInt(Data[1]));
                        socket.setSendBufferSize(Integer.parseInt(Data[1]));
                        FileProperties = Data[2];
                    };
                    case "FULL":
                        Stop();
                        break;
                }
            //}
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String GetMSG()
    {
        String txt = msg;
        msg = "";
        return txt;
    }

    public void Send(String txt)
    {
        try {
            out.writeBytes(txt);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void Send(byte[] buffer)
    {
        try {
            out.write(buffer);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void Stop()
    {
        try {
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        run = false;
    }
}
