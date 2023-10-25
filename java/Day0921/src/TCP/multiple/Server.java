package TCP.multiple;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        //这里的ServerSocket（）是本机接收外部的端口号
        try (ServerSocket server = new ServerSocket(9909); Socket socket = server.accept(); InputStream in = socket.getInputStream(); DataInputStream di = new DataInputStream(in); OutputStream os = socket.getOutputStream(); DataOutputStream dos = new DataOutputStream(os);) {
            System.out.println(socket);

            //这里使用in.available()效果不佳，使用DataInputStream的readUTF方法会更好，read()方法会自动阻塞线程，只需要while(true)就可以接收
            while (true) {
                String temp = di.readUTF();
                System.out.println("Client: " + temp);
                dos.writeUTF("成功收到消息");
                dos.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
