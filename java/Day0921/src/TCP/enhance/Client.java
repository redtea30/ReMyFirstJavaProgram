package TCP.enhance;

import com.google.gson.Gson;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {

    static Gson gson = new Gson();

    public static void main(String[] args) {

        //本项目为了更换端口进行测试，没有写多次循环
        try (Socket socket = new Socket("localhost", 9999);
             OutputStream out = socket.getOutputStream();
             Scanner sc = new Scanner(System.in);
             DataOutputStream dos = new DataOutputStream(out);
        ) {

            System.out.println(socket.getPort() + "  目标端口");
            String format = "text";
            System.out.println("请输入消息");
            String message = sc.next();
            dos.writeUTF(message);
            System.out.println("发送成功，请重新运行");//这里或许可以试下多线程？写到run（）方法里就完事了

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
