package fileOutPutTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) {
        File file = new File("Day0913/src/fileOutPutTest/Test.txt");

        if (!(file.exists())) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //换行符输出流无效
        //String str = "Hello /n";
        String str = "Hello";
        byte[] bytes = str.getBytes();


        int i = 0;


        while (i < 9990) {
            //try-with-resources 带自动关闭autocloseable
            try (FileOutputStream testFile = new FileOutputStream(file, true);) {
                testFile.write(bytes);
                testFile.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
