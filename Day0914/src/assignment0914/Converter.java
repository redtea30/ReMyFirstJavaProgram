package assignment0914;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Converter {
    public static void main(String[] args) {
        //File utf8in = new File("Day0914/src/assignment0914/UTF8IN.txt");
        //File GBKout = new File("Day0914/src/assignment0914/GBKOUT.txt");
        File utf8out = new File("Day0914/src/assignment0914/UTF8OUT.txt");
        File GBKin = new File("Day0914/src/assignment0914/GBKIN.txt");

        //characterStream(utf8out, GBKin);

        byteStream(utf8out, GBKin);

    }

    private static void byteStream(File utf8out, File gbKin) {

        //拿到
        byte[] bytes;
        try (FileInputStream fs = new FileInputStream(utf8out);) {
            byte[] temp = fs.readAllBytes();
            bytes = temp;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //或许需要先转成string的形式再转成gbk的byte，直接转成byte不可行？
        String str = new String(bytes, Charset.forName("UTF-8"));
        byte[] outP = str.getBytes(Charset.forName("GBK"));
        try (FileOutputStream fo = new FileOutputStream(gbKin);) {
            fo.write(outP);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    /**
     * 字符流类型转换
     * 通过InputStreamReader/OutputStreamWriter进行转换
     *
     * @param utf8out
     * @param gbKin
     */
    private static void characterStream(File utf8out, File gbKin) {

        StringBuffer sb = new StringBuffer();
        try (FileInputStream is = new FileInputStream(utf8out);
             InputStreamReader ir = new InputStreamReader(is);
        ) {

            int temp;
            while ((temp = ir.read()) != -1) {
                if (temp != -1) {
                    sb.append((char) temp);
                }
            }
            // System.out.println(sb);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String str = sb.toString();
        System.out.println(str);
        char[] temp = new char[sb.length()];
        sb.getChars(0, sb.length(), temp, 0);
        System.out.println(Arrays.toString(temp));

        try (FileOutputStream fo = new FileOutputStream(gbKin, false);
             OutputStreamWriter ow = new OutputStreamWriter(fo, Charset.forName("GBK"));
        ) {
            ow.write(str, 0, str.length());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
