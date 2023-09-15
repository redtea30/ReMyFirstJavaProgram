import com.google.gson.Gson;

import java.io.*;

public class DataOutputStreamTest {
    public static void main(String[] args) {
        //DataOutputStream构造里塞一个FileOutputStream
        //FileOutputStream构造里塞一个File
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("Day0915/src/test02.txt")));
             DataInputStream dis = new DataInputStream(new FileInputStream(new File("Day0915/src/test02.txt")))) {
            dos.writeBoolean(true);
            System.out.println(dis.readBoolean());


            dos.writeChars("吧");

            System.out.println(dis.readChar());

            dos.writeLong(123);
            System.out.println(dis.readLong());
            dos.writeLong(123);
            dos.writeLong(123);
            dos.writeLong(123);
            dos.writeLong(123);
            dos.flush();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Gson gson = new Gson();
        gson.toJson("sdf");

    }
}