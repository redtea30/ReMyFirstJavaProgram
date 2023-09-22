package TCP.enhance;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {

    static Gson gson = new Gson();

    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 9909);
             OutputStream out = socket.getOutputStream();
             Scanner sc = new Scanner(System.in);
        ) {

            System.out.println(socket.getPort());
            String format = "text";

            while (true) {
                System.out.println("请输入消息");
                String message = sc.next();
                Type temp = new Type(format, message, socket.getPort());

                String next = gson.toJson(temp, Type.class);
                out.write(next.getBytes());
                //以下是为了测试消息有没有发出去
                out.flush();
                Thread.sleep(100);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
