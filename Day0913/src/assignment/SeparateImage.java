package assignment;

import java.io.*;

public class SeparateImage {
    public static void main(String[] args) {

        File file = new File("D:/image/2023-08-16 14-40-44.mkv");
        File out = new File("D:/image/copy1");
        //separateFile(file, out);


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
