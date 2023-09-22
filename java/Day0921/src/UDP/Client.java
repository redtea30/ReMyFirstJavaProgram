package UDP;

import java.io.File;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("client启动");
        Scanner sc = new Scanner(System.in);

        //send
        try {
            DatagramSocket socket = new DatagramSocket(7788);
            //这里只需要写一个Datagram对象，既能收也能发
            File file = new File("Day0921/src/img");
            while (true) {
                System.out.println("client");
                String input = sc.next();
                byte[] bytes = input.getBytes();
                //这个是退出指令
                if (input.equals("exit")) {
                    socket.close();
                    break;
                }
                //两边都是用GBK进行编码

                //sendPac
                InetAddress address = InetAddress.getByAddress(new byte[]{10, 0, 3, (byte) 156});
                DatagramPacket pac = new DatagramPacket(bytes, 0, bytes.length, address, 8888);
                socket.send(pac);


                //recPac
                byte[] bytes1 = new byte[1024 * 64];
                DatagramPacket pac1 = new DatagramPacket(bytes1, 0, bytes1.length);
                socket.receive(pac1);
                System.out.println("client： ");
                System.out.println(new String(bytes1, 0, pac1.getLength()));
            }


        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
