import java.io.*;

public class Cutter {
    public static void main(String[] args) throws IOException, InterruptedException {
        long current = System.currentTimeMillis();
        File file = new File("D:\\image\\阳光电影dy.ygdy8.com.大力士：乔治·福尔曼.2023.BD.1080P.中英双字.mkv");
        File out = new File("D:\\image\\copy1");
        int maximumSize = (int) Math.pow(1024, 2);

        FileInputStream fs = new FileInputStream(file);

        int count = (int) (file.length() / maximumSize) + 1;
        byte[] temp = new byte[maximumSize];

        Thread[] threads = new Thread[count];
        for (int i = 0; i < count; i++) {
            String name = out + File.separator + (i + 1) + ".mkv";
            File outPut = new File(name);
            threads[i] = new Thread(() -> {
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(name);
                    fos.write(fs.read());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            threads[i].start();
        }

        for (Thread i : threads) {
            i.join();
        }
        System.out.println(System.currentTimeMillis() - current);
        //单线程 2366
        //多线程未加锁 804


    }

    public static void cutter() {
//        FileOutputStream fos =new FileOutputStream()




    }


}
