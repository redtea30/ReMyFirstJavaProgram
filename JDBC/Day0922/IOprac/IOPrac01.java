import java.io.*;

public class IOPrac01 {
    public static void main(String[] args) {

        test();
    }

    public static void test() {
        File file = new File("JDBC/Day0922/IOprac/pre.txt");
        File out = new File("JDBC/Day0922/IOprac/result1.txt");
        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader);
             FileWriter writer = new FileWriter(out);
             BufferedWriter bw = new BufferedWriter(writer);
        ) {
            //读取
            String temp = "";
            while (br.ready()) {
                temp += br.readLine();
                temp += System.lineSeparator();
            }
            //写入
            bw.write(temp);
            //打印
            System.out.println(temp);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("结束");
        }


    }
}
