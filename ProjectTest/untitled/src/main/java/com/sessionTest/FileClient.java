package com.sessionTest;

import java.io.*;
import java.net.Socket;

/**
 * Package-name: com.serverSite
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 02-36
 * Describe：
 */

public class FileClient {

    public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {

        // 创建Socket连接服务器
        Socket socket = new Socket("localhost", 9999);

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        // 发送create操作指令
        oos.writeObject("create");

        // 发送文件名
        oos.writeObject("test.txt");

        // 接收文件名确认
        String resp = (String) ois.readObject();
        System.out.println("Confirm file name response: " + resp);

        // 如果确认成功,发送文件内容
        if ("OK".equals(resp)) {
            File file = new File("test.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] buff = new byte[1024];
            int len = 0;
            while((len = fis.read(buff)) != -1) {
                oos.write(buff, 0, len);
            }
        }

        // 接收服务器响应
        String result = (String) ois.readObject();
        System.out.println("Server response: " + result);

        socket.close();
    }

}