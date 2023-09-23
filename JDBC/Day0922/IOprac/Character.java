import java.io.*;

public class Character {
    public static void main(String[] args) {
        test1("嗨嗨嗨，老八秘制小汉堡");


    }

    /**
     * 改成gbk写入外部
     *
     * @param pre
     */
    public static void test1(String pre) {
        File out = new File("JDBC/Day0922/IOprac/result1.txt");
        try (OutputStream outs = new FileOutputStream(out);) {

            //通过生成对应字符的byte数组进行转换
            byte[] bytes = pre.getBytes("GBK");
            String after = new String(bytes);
            System.out.println(after);
            outs.write(bytes);//文件测试通过


        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
