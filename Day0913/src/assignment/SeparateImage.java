package assignment;

import java.io.*;

public class SeparateImage {
    public static void main(String[] args) throws IOException {

        File file = new File("D:/image/2023-08-16 14-40-44.mkv");
        File out = new File("D:/image/copy1");
        //separateFile(file, out);
        separator(file, out);

    }

    /**
     * 重写了下逻辑，还是能执行。
     * 问题好像是方法不熟练，用不利索，甚至想不起来哪个方法是干啥的？
     * 年纪大了记性差？
     *
     * @param file
     * @param out
     * @throws IOException
     */
    private static void separator(File file, File out) throws IOException {
        if (!(out.exists())) {
            out.mkdirs();
        }

        FileInputStream in = new FileInputStream(file);//获取file的输入流对象
        Long total = file.length();//获取file的文件大小，单位 n/byte
        int partSize = (int) Math.pow(1024, 2);
        int count = (int) (total / partSize + 1);//获取循环单位,向上提升数值一
        byte[] bytes = new byte[partSize];//期望获得的文件大小


        for (int i = 1; i < count + 1; i++) {//这个循环数量和需要生成的文件数量一样
            int readlen = in.read(bytes);//read会自动计数，所以不用操心数据的问题
            //这个构造是： 从输入流中读取数据，并将数据存储在缓存区数组b中，返回实际读取的字节数
            File output = new File(out, i + ".mkv");//这里就是简单命名下
            FileOutputStream outputStream = new FileOutputStream(output);//新建输出流对象，位置就是新建的output
            outputStream.write(bytes, 0, readlen);//直接输出
            //
        }


    }


    /**
     * 不是很明白的写法，甚至搞不明白哪里不明白，但是就是写出来了
     *
     * @param file
     * @param out
     */
    private static void separateFile(File file, File out) {
        if (!(out.exists())) {
            out.mkdirs();
        }
        try (FileInputStream fIn = new FileInputStream(file);

        ) {

            Long total = file.length();
            int partSize = (int) Math.pow(1024, 2);
            int count = (int) (total / partSize) + 1;
            byte[] temp = new byte[partSize];


            int countIndex = 1;
            int readLen;
            while ((readLen = fIn.read(temp)) != -1) {

                File outFile = new File(out, countIndex++ + ".mkv");

                FileOutputStream fOut = new FileOutputStream(outFile);

                fOut.write(temp, 0, readLen > partSize ? partSize : readLen);

                if (readLen < partSize) break;


            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
