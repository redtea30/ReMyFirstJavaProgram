package com.sessionTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Package-name: com.serverSite
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 00-04
 * Describe：
 */

public class Server {

    ServerSocket serverSocket;

    public Server() throws IOException {
        serverSocket = new ServerSocket(9999);
    }

    public void start() throws IOException {

        while (true) {
            System.out.println("等待连接......");

            // 接收一个连接
            Socket socket = serverSocket.accept();
            System.out.println("客户端连接成功");

            // 处理连接线程
            new ClientHandler(socket).start();
        }

    }

    class ClientHandler extends Thread {

        private Socket socket;
        private DataInputStream dis;
        private DataOutputStream dos;
        private DataInputStream name;


        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            try {

                // 初始化流
                dis = new DataInputStream(socket.getInputStream());
                name = new DataInputStream(socket.getInputStream());
                dos = new DataOutputStream(socket.getOutputStream());

                // 持续接收消息
                while (true) {
                    String msg = dis.readUTF();
                    switch (msg) {
                        case Constant.EVENT_CREATE -> {

                        }
                        case Constant.EVENT_DELETE -> {
                            String string = name.readAllBytes().toString();
                        }
                        case Constant.EVENT_MODIFY -> {

                        }

                    }


                    System.out.println("收到消息:" + msg);

                    // 回复消息
                    dos.writeUTF("消息已收到");
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // 关闭资源
                try {
                    dis.close();
                    dos.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start();
    }
}

