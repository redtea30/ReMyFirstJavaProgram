package assignment.mergeFile;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class MergeTest {
    public static void main(String[] args) throws Exception {
        File path = new File("D:\\image\\copy1");
        File dest = new File("D:\\image\\copy2.mkv");
        merge(path, dest);
    }

    private static void merge(File path, File dest) throws IOException {
        //先检查文件目录存在不存在
        if (!path.exists()) {
            throw new FileNotFoundException("没有源文件");
        } else if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }

        //过滤器，为什么我不知道？
        File[] listFiles = path.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.endsWith(".mkv");//这里用临时文件.tmp或许会好一点
            }
        });

        //排序，通过Arrays工具类
        Arrays.sort(listFiles, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                int int1 = Integer.parseInt(o1.getName().split("\\.")[0]);
                int int2 = Integer.parseInt(o2.getName().split("\\.")[0]);
                return int1 - int2;
            }
        });

        //开始写入
        for (File file : listFiles) {
            FileInputStream in = new FileInputStream(file);
            FileOutputStream os = new FileOutputStream(dest, true);
            byte[] inStream = in.readAllBytes();
            os.write(inStream);

        }



    }
}
