package TCP.Single;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9090);
             OutputStream out = socket.getOutputStream();
             InputStream in = socket.getInputStream();
        ) {

            //单发消息
            String temp = "Hello world";
            out.write(temp.getBytes("GBK"));

            //单收消息
//            byte[] bytes = new byte[1024];
//            int n;
//            String tempStr = "";
//            while ((n = in.read(bytes)) != -1) {
//                tempStr += new String(bytes, 0, n);
//            }
//            System.out.println(tempStr);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
