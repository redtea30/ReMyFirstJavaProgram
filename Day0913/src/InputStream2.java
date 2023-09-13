import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream2 {
    public static void main(String[] args) {
        File file = new File("Day0913/src/Test2.txt");

        try {
            FileInputStream in = new FileInputStream(file);

            //第一种获取方式，只能获取单个字符
            //使用byte数组会获取bute数组长度额字符串
/*            //readBytes
            byte[] bytes = new byte[10];
            int read = in.read(bytes);
            System.out.println("本次读取了 " + read);   //10
            System.out.println(new String(bytes, 0, read));*/


            //使用readAllByte会直接返回一个byte数组，包含所有数据
            //readAllBytes
/*            byte[] bytes2 = in.readAllBytes();
            System.out.println(new String(bytes2));*/


            //使用循环拼接字符
/*            int size = 0;
            byte[] bytes3 = new byte[10];
            String str = "";
            //read==-1就是到达该字符串的边界
            while ((size = in.read(bytes3)) != -1) {
                str += new String(bytes3, 0, size);
            }
            System.out.println(str);*/


            //直接使用avaliable方法获取字符长度，使用字符长度进行获取
            //使用skip进行跳过之后原长度没有改变，会出现null值
            System.out.println(in.available());//available:返回可从此输入流读取(或跳过)的剩余字节数的估计值，而不会因下次调用此输入流的方法而阻塞。
            byte[] byte4 = new byte[in.available()];
            System.out.println(in.skip(2));//从输入流中跳过并丢弃n字节的数据。
            int read = in.read(byte4);
            System.out.println(new String(byte4));


            in.close();//不要忘记关闭流
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
