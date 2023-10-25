package TCP.enhance;

import com.google.gson.Gson;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static Gson gson = new Gson();

    public static void main(String[] args) {
        System.out.println("服务端启动");
        try (ServerSocket server = new ServerSocket(9909);
             Socket socket = server.accept();
             InputStream in = socket.getInputStream();
             DataInputStream dis = new DataInputStream(in);
        ) {
            System.out.println(socket);


            System.out.println(dis.readUTF());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class myThread extends Thread {
    private Socket socket;

    public myThread(Socket socket) {

    }
}
