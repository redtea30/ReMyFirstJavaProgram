package TCP.enhance;

import com.google.gson.Gson;

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
        ) {
            System.out.println(socket);
            Type temp;
            String json = "";
            int n;
            byte[] bytes = new byte[1024];
            while (true) {

                while ((n = in.read(bytes)) != -1) {
                    json += new String(bytes, 0, n);
                }
                Object obj = gson.fromJson(json, Type.class);
                System.out.println(obj.toString());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
