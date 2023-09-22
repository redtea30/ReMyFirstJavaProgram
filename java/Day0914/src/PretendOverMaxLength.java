import java.io.*;

/**
 * 假装超过了Integer的maxLength
 * 数组最长安全长度是Integer.maxLength - 8
 */
public class PretendOverMaxLength {

    public static void main(String[] args) throws IOException {
        long pretendLength = (int) Math.pow(1024, 2) * 128;//0.125 GB
        int pretendIntLength = (int) Math.pow(1024, 3);// 1 GB
        File file = new File("D:\\image\\copy2.mkv");
        File dest = new File("D:\\image\\copy3");
        cutting(file, dest, pretendLength, pretendIntLength);

    }

    private static void cutting(File file, File dest, long pretendLength, int pretendIntLength) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("没有找到该文件");
        } else if (!dest.exists()) {
            dest.mkdirs();
        }
        int count = 0;

        FileInputStream in = new FileInputStream(file);
        while (in.available() > 0) {
            //大于模拟Int长度
            if (file.length() > pretendLength) {
                long sum = pretendLength;
                File fil = new File(dest, ++count + ".mkv");
                FileOutputStream out = new FileOutputStream(fil, true);

                while (sum > pretendIntLength && in.available() > 0) {
                    byte[] bytes = new byte[pretendIntLength];
                    int readSize = in.read(bytes);
                    out.write(bytes);
                    sum -= readSize;
                }
                if (in.available() > 0) {
                    byte[] bytes = new byte[pretendIntLength];
                    int readSize = in.read(bytes);
                    out.write(bytes, 0, readSize);

                }

            } else {
                //这种情况可以直接输出，小于模拟Int长度
                byte[] bytes = new byte[pretendIntLength];
                File fil = new File(dest, 1 + ".mkv");
                FileOutputStream out = new FileOutputStream(fil);
                out.write(bytes);

            }

        }
    }


}
