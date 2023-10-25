package com.sessionTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Package-name: com.serverSite
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 01-10
 * Describe：
 */

public class FileService {

    private ServerSocket server;

    public FileService(int port) throws IOException {
        server = new ServerSocket(port);
    }

    public void start() throws IOException, ClassNotFoundException {
        while (true) {
            Socket client = server.accept();
            processSync(client);
        }
    }

    private void processSync(Socket client) throws IOException, ClassNotFoundException {

        InputStream in = client.getInputStream();
        OutputStream out = client.getOutputStream();

        ObjectInputStream oin = new ObjectInputStream(in);
        ObjectOutputStream oout = new ObjectOutputStream(out);

        //接收操作方式
        String operate = (String) oin.readObject();//一次接收

        if (operate.equals("create")) {
            // 1. 接收文件名
            String fileName = (String) oin.readObject();

            // 2. 确认文件名
            oout.writeObject("OK");

            // 3. 创建文件对象
            File file = new File(fileName);
            setDirs(file);

            // 4. 接收文件内容写入
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream(file));

            byte[] data = new byte[1024];
            int len = 0;
            while ((len = in.read(data)) != -1) {
                bos.write(data, 0, len);
            }

            bos.close();

            // 5. 返回响应
            oout.writeObject("File created.");

        } else if (operate.equals("delete")) {

            // 删除文件
            //file.delete();
            // 返回响应
            oout.writeObject("File deleted.");

        } else {
            // 修改文件操作
            //file.delete();


        }
        // 1. 接收文件名
        String fileName = (String) oin.readObject();

        File file = new File(fileName);
        //创建文件路径
        setDirs(file);

        // 2. 确认文件名
        oout.writeObject("OK");


        client.close();
    }


    //创建父类路径
    public void setDirs(File file) {
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
    }

}
