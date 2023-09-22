package TCP.Single;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(9090);//监听9090端口
             Socket socket = server.accept();
             OutputStream out = socket.getOutputStream();
             InputStream in = socket.getInputStream();
        ) {

            System.out.println(socket);


            //单收消息
            int n;
            String temp = "";
            byte[] bytes = new byte[1024];
            while ((n = in.read(bytes)) != -1) {
                temp += new String(bytes, 0, n);
            }
            System.out.println(temp);

            //单发消息
//            String temp1 = "苟利国家生死以，其因福祸趋避之。";
//            out.write(temp1.getBytes());
//            out.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
