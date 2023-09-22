import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTest {
    public static void main(String[] args) {

        String path = "Day0913/src";
        String name = "Test.txt";
        File file = new File(path, name);
        File file1 = new File(path + File.separator, name);
        File file2 = new File(path + File.separator + name);
        //file.separator是分隔符“//”或者“\”，不同系统会自动切换

        System.out.println(File.pathSeparator);//就是; 多个文件地址之间的分割

        //createNewFile
        File file3 = new File(path + File.separator + "王老菊.txt");
        try {
            System.out.println(file3.createNewFile());//createNewFile返回值为boolean
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //renameTo
        //返回值类型 boolean 重命名需要文件路径
        File file4 = new File(path + File.separator + "不存在.txt");
        System.out.println(file3.renameTo(file4));

        //copy
        String path1 = "Day0913/src";
        String name1 = "不存在.txt";
        String name2 = "现在有了.txt";
        Path path2 = new File(path1 + File.separator + name1).toPath();
        //toPath()方法直接吧file类型转成path类型
        Path path3 = new File(path1 + File.separator + name2).toPath();
        //会直接重命名文件？
        try {
            Files.copy(path2,path3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
