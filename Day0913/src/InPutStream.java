import java.io.FileInputStream;
import java.io.IOException;

public class InPutStream {
    public static void main(String[] args) {
        String name = "Day0913/src/Test.txt";
        try {
            FileInputStream in = new FileInputStream(name);
/*          //只能按预设长度读取
            int read = in.read();
            System.out.println(read);
            byte[] bytes = new byte[20];
            in.read(bytes);
            System.out.println(new String(bytes));*/
            //可以直接读取所有bytes
            byte[] bytes = in.readAllBytes();
            System.out.println(new String(bytes));
            in.close();    //一定要关闭io流，不关会一直吃内存
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
