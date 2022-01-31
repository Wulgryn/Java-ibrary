package Wulgryn.Net.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Wulgryn.IO.FileManager;
import Wulgryn.Properties.Application;
import Wulgryn.Properties.Common;

public class TcpClientHandler {
    private Socket socket;
    private int Num = -1;

    private DataInputStream in;
    private DataOutputStream out;

    private boolean run = true;

    TcpListener server;
    
    public TcpClientHandler(Socket socket,TcpListener server)
    {
        this.socket = socket;
        this.server = server;
        SetupClient();
    }

    public TcpClientHandler(Socket socket,int Number,TcpListener server)
    {
        Num = Number;
        this.socket = socket;
        this.server = server;
        SetupClient();
    }

    public int GetNumber()
    {
        return Num;
    }

    public void SetNumber(int number)
    {
        Num = number;
    }

    private void SetupClient()
    {
        try {
            socket.setReceiveBufferSize(64);
            socket.setSendBufferSize(64);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            System.out.println("Connected to server with number: " + Num);
            new Thread(){
                public void run() {
                    while(run){
                        Common.Wait(1);
                            ReadMSG();
                    }
                    System.out.println("ClientHandler stopped.");
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
            
            if(cmd == "FILE")
            {
                byte[] buffer = new byte[socket.getReceiveBufferSize()];
                in.read(buffer);
                System.out.println(buffer.length);
                FileManager.WriteBytes(FileProperties, buffer);
                SetResceiveBufferSize(64);
                socket.setSendBufferSize(64);
                cmd = "";
                return;
            }

            String Data = "";
            byte[] buffer = new byte[socket.getReceiveBufferSize()];
            //socket.setReceiveBufferSize(i);
            buffer = new byte[socket.getReceiveBufferSize()];
            in.read(buffer, 5, buffer.length - 5);
            Data = new String(buffer);
            System.out.println(Data);
            
        } catch (IOException e) {
            Stop();
            e.printStackTrace();
            //Application.Exit();
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
        run = false;
        try {
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(Num == -1) return;
        server.clients.remove(Num);
        for(int i = 0; i < server.clients.size(); i++)
        {
            server.clients.get(i).SetNumber(i);
        }
    }
}
