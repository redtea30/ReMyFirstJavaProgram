package UDP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
    public static void main(String[] args) {
        //InetAddress一开始不能赋值，会报错
        InetAddress it = null;
        try {
            it = InetAddress.getByName("www.bilibili.com");
            System.out.println(it.getHostAddress());//117.23.60.15
            Object obj = it.getHostAddress();
            System.out.println(obj.getClass());//class java.lang.String

            System.out.println(it.getHostName());//www.bilibili.com
            Object obj1 = it.getHostName();
            System.out.println(obj1.getClass());//class java.lang.String


            System.out.println(it.getCanonicalHostName());//117.23.60.15
            Object obj2 = it.getCanonicalHostName();
            System.out.println(obj2.getClass());//class java.lang.String

            System.out.println(it.isReachable(20));//true

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(it);//www.bilibili.com/171.214.10.142


        InetAddress myHost = null;


        //本机IP地址也适用
        try {
            myHost = InetAddress.getByAddress(new byte[]{127, 0, 0, 1});
            System.out.println(myHost);//127.0.0.1


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }


    }
}
