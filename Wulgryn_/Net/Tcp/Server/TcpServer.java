package Wulgryn.Net.Tcp.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    private int port;

    private boolean run = true;

    public TcpServer(int port)
    {
        this.port = port;
    }

    public void Start()
    {
        try {
            ServerSocket server = new ServerSocket(port);
            new Thread()
            {
                public void run() {
                    while(run)
                    {
                        try {
                            Socket socket = server.accept();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        
                    }
                };
            }.start();
        } catch (Exception e) {}
    }

    private void AddClient(Socket socket)
    {

    }
}
