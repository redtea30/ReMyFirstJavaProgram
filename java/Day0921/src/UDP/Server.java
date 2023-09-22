package UDP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("服务端启动");


        try {
            DatagramSocket receive = new DatagramSocket(8888);//receive
            DatagramSocket send = new DatagramSocket();//receive

            while (true) {
                //receive
                byte[] bytes = new byte[1024 * 64];
                DatagramPacket pac = new DatagramPacket(bytes, 0, bytes.length);
                receive.receive(pac);
                System.out.println("client： ");
                System.out.println(pac.getAddress() + ": " + new String(bytes, 0, pac.getLength()));

                //send
                System.out.println("UDP.Server： ");
                String output = sc.next();
                //这个是退出指令
                if (output.equals("exit")) {
                    send.close();
                    receive.close();
                    break;
                }
                InetAddress myHost = InetAddress.getByAddress(new byte[]{10, 0, 3, (byte) 156});
                DatagramPacket pac1 = new DatagramPacket(output.getBytes(), 0, output.getBytes().length, myHost, 7788);
                send.send(pac1);
            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
