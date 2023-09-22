package fileOutPutTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) {
        File src = new File("Day0913/src/fileOutPutTest/Test.txt");
        File dest = new File("Day0913/src/fileOutPutTest/Test2.txt");
        copyFile1(dest, src);

    }

    private static void copyFile1(File dest, File src) {
        try (FileInputStream srcIn = new FileInputStream(src);
             FileOutputStream destOut = new FileOutputStream(dest);
        ) {
            if (!(dest.getParentFile().exists())) {
                dest.getParentFile().mkdirs();
            } /*else if (!(dest.exists())) {
                dest.createNewFile();
            }*/
            //测试dest没有创建文件可以执行不
            //dest地址未给会直接创建一个新的文件
            byte[] bytes = srcIn.readAllBytes();
            destOut.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
