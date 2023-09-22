import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutPutTest {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("Day0913/src/outPutTest.txt");
            String testStr = "！！本文件为写入测试！！";
            byte[] testBytes = testStr.getBytes();
            byte[] bytes = {97, 98, 99, 100};
            out.write(bytes);
            out.write(testBytes);
            out.flush();
            out.close();
            //测试append方法
            FileOutputStream out1 = new FileOutputStream("Day0913/src/outPutTest.txt", true);
            out1.write(bytes);
            byte[] testBytes1 = "写入测试2 使用append".getBytes();
            testBytes1 = Arrays.copyOf(testBytes1, testBytes1.length + testBytes.length);
            //arraycopy的第一个是源文件，就是写入文件，第二个是写入文件的启示值，第三个是被写入数组，第四个是被写入index，最后一个是写入长度
            System.arraycopy(testBytes, 0, testBytes1, testBytes1.length - testBytes.length, testBytes.length);
            out1.write(testBytes1);
            out1.flush();
            out1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
