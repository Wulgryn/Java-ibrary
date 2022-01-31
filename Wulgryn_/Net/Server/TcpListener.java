package Wulgryn.Net.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpListener {
    private int port;

    private int ReceiveBufferSize = 16;
    private boolean run = true;

    protected List<TcpClientHandler> clients = new ArrayList<TcpClientHandler>();
    public int ServerSize = 100;
    
    public TcpListener(int port)
    {
        this.port = port;
    }

    public void Start(TcpListener listener)
    {
        try {
            ServerSocket server = new ServerSocket(port);
            server.setReceiveBufferSize(ReceiveBufferSize);
            new Thread(){
                public void run() {
                    while(run)
                    {
                        try {
                            Socket socket = server.accept();
                            if(clients.size() < ServerSize)
                            {
                                clients.add(new TcpClientHandler(socket, clients.size(),listener));
                                System.out.println("Client connected");
                            }
                            else
                            {
                                TcpClientHandler client = new TcpClientHandler(socket, listener);
                                client.Send("FULL Server full. Try again later.");
                                client.Stop();
                            }
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                };
            }.start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void Stop()
    {
        clients.stream().forEach(c -> {
            c.Send("Server Closed.");
            c.Stop();
        });
        run = false;
    }

    public void SendAll(String txt)
    {
        clients.stream().forEach(c -> {
            c.Send(txt);
        });
    }

    public void SendAll(byte[] buffer)
    {
        clients.stream().forEach(c -> {
            c.Send(buffer);
        });
    }
}
