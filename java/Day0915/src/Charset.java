import java.io.*;

public class Charset {
    public static void main(String[] args) {


        File file = new File("Day0915/src/test01.txt");
        File out = new File("Day0915/src/test02.txt");
        // convertorFile(file, out);
        convertorFile(file, out);

    }

    private static void convertorFile(File file, File out) {
        //查看系统默认编码
        System.out.println(System.getProperty("file.encoding"));
        try (FileReader fr = new FileReader(file);
             FileWriter fw = new FileWriter(out, java.nio.charset.Charset.forName("GBK"));
             BufferedWriter bf = new BufferedWriter(fw);
             BufferedReader br = new BufferedReader(fr);
        ) {
            while (br.ready()) {
                bf.write(br.read());
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void convertorFile1(File file, File out) {
        //查看系统默认编码
        System.out.println(System.getProperty("file.encoding"));
        try (FileReader fr = new FileReader(file);
             FileWriter fw = new FileWriter(out, java.nio.charset.Charset.forName("GBK"));
        ) {
            while (fr.ready()) {
                fw.write(fr.read());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}



}
