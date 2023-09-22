package FileTest;

import java.io.File;
import java.util.*;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("D:/云创动力课程录像");
        File file1 = new File("C:/");
        System.out.println(file.getName() + "\t" + file.getFreeSpace() / Math.pow(1024, 3) + "\tGB");
        System.out.println(file.getName() + "\t" + file.getTotalSpace() / Math.pow(1024, 3) + "\tGB");
        System.out.println(file1.getName() + "\t" + file1.getFreeSpace() / Math.pow(1024, 3) + "\tGB");
        System.out.println(file1.getName() + "\t" + file1.getTotalSpace() / Math.pow(1024, 3) + "\tGB");

        System.out.println("file.isDirectory()" + file.isDirectory());


        File[] files = file.listFiles();
        List<File> listFile = Arrays.asList(files);
        System.out.println("listFile.size()" + listFile.size());
        for (File i : listFile) {
            System.out.println(i.getName());
        }


        File[] root1 = file.listRoots();
        for (File i : root1) {
            System.out.println("磁盘 " + i);
            System.out.println("容量 " + i.getTotalSpace() / Math.pow(1024, 3) + "GB");
        }


        File test1 = new File("D:\\New folder\\test\\test\\test.txt");
        System.out.println(test1.exists());
        System.out.println(test1.mkdir());
        System.out.println(test1.mkdirs());


        File file2 = new File("D:\\New folder\\New RTF 文件.rtf");
        System.out.println(file2.exists());
        System.out.println(file2.isFile());
        System.out.println(file2.lastModified());//1694517085062
        long da = file2.lastModified();
        Date date = new Date(da);
        System.out.println(date); //Tue Sep 12 19:11:25 CST 2023


        //找到目录下所有文件，并输出
        System.out.println(file2.getParentFile());
        List<File> list = showAllFiles(file2.getParentFile());//就是D:\New folder
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            File i = (File) iterator.next();
            System.out.println(i);
        }


        //Gpt说不能直接对根目录操作
        String path = "D:\\云创动力课程录像";
        file2 = new File(path);

        //File[] file3 = List.ListRoot();
        System.out.println(file2);
        List<File> list1 = showAllFiles(file2);
        Iterator iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            File i = (File) iterator1.next();
            System.out.println(i);
        }


        //计算文件大小
        File file3 = new File("D:\\云创动力课程录像");
        Long totalSize = countAllFileSize(file3);
        System.out.printf(file3.getName() + "文件大小 %.2f GB", totalSize / Math.pow(1024, 3));


        //所有图片文件
        File file4 = new File("D:\\小米gallery");
        List<File> list2 = showAllPicture(file4);
        list2.forEach(o -> {
            System.out.println(o.getName());
        });

        //删除指定目录的所有文件和文件夹
        File file5 = new File("D:\\小米gallery");
        //System.out.println(deleteAllFile(file5) ? "删除成功" : "删除失败");

    }

    /**
     * 删除目录中的所有文件
     *
     * @param file
     * @return
     */
    /*private static boolean deleteAllFile(File file) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                deleteAllFile(files[i]);
                files[i].delete();
            } else files[i].delete();
        }
        if (file.listFiles().length == 0) return true;
        return false;
    }*/

    /**
     * 显示特定类型图片，jpg gif png
     * 可以使用集合进行检测
     *
     * @param file
     * @return
     */
    private static List<File> showAllPicture(File file) {
        List<File> list = new ArrayList<File>();
        File[] fileList = file.listFiles();
        for (File i : fileList) {
            if (i.isFile()
                    && (i.getName().endsWith(".JPG"))
                    || i.getName().endsWith(".PNG")
                    || i.getName().endsWith(".GIF")
                    || i.getName().endsWith(".jpg")
                    || i.getName().endsWith(".png")
                    || i.getName().endsWith(".gif")) {
                list.add(i);
            } else if (i.isDirectory()) {
                list.addAll(showAllPicture(i));
            }
        }
        return list;
    }

    /**
     * 计算文件大小
     *
     * @param file
     * @return
     */
    private static Long countAllFileSize(File file) {
        Long count = 0l;
        File[] fileList = file.listFiles();
        for (File i : fileList) {
            if (i.isFile()) {
                count += i.length();
            } else if (i.isDirectory()) {
                countAllFileSize(i);
                return count + countAllFileSize(i);
            }
        }
        return count;
    }

    //private static void Long reCountAllFileSize(File file)



    /**
     * 找到文件目录下的所有文件和文件名
     *
     * @param file
     * @return
     */
    private static List<File> showAllFiles(File file) {
        File[] fileList = file.listFiles();
        List<File> list = new ArrayList<File>();
        for (File i : fileList) {
            if (i.isFile()) list.add(i);
            else if (i.isDirectory()) {
                showAllFiles(i);
                list.add(i);
            }
        }
        return list;
    }


}
