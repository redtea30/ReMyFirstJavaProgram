package TCP.multiple;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    //该项目主要还是模拟一下聊天室的情况
    //测试连续接收
    public static void main(String[] args) {

        //这里的Socket（）构造是目标机的地址，和端口号
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9909);
             OutputStream out = socket.getOutputStream();
             DataOutputStream ds = new DataOutputStream(out);
             InputStream in = socket.getInputStream();
             DataInputStream dis = new DataInputStream(in);
             Scanner sc = new Scanner(System.in);

        ) {

            while (true) {
                System.out.print("Host： ");
                String temp = sc.next();
                ds.writeUTF(temp);
                ds.flush();

                System.out.println("Server: " + dis.readUTF());
            }
            //测试结果
            //Host： 狗东西
            //Server: 成功收到消息
            //Host： 妈的
            //Server: 成功收到消息
            //Host： 妈妈生的
            //Server: 成功收到消息
            //Host：


            //老版本测试，通过循环模拟多次输入，效果不佳
            //接收方使用available（）能接收但是不能换行？奇怪了
/*            String temp = "";
            for (int i = 0; i < 10; i++) {
                out.write("hola".getBytes());
                out.flush();
            }*/
            //老版本读取文件传输模拟
            //不能换行？
/*            File file = new File("Day0921/src/TCP/multiple/test.txt");
            FileReader in = new FileReader(file);
            BufferedReader bi = new BufferedReader(in);
            int n;
            String temp1 = "";
            while (bi.read() != -1) {
                temp1 = bi.readLine();
                out.write(temp1.getBytes());
            }

            in.close();
            bi.close();*/


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
