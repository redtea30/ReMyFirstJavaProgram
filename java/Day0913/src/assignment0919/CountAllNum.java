package assignment0919;

import java.io.*;
import java.util.Arrays;

//使用字节输出流将一组整数写入到文件中，并使用字节输入流读取这些整数并计算它们的总和。
public class CountAllNum {
    public static void main(String[] args) {
        //整数占用四个字节，不用考虑和byte一样的乱码问题

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(countAllNum(arr));

        int[] arr1 = {1111, 2222, 3333, 4444, 5555, 6666};
        System.out.println(countAllNum(arr1));
    }

    /**
     * 原理：贼蠢
     * int[] -> String[] ->Byte[]
     * byte[] -> String[] -> Integer
     *
     * @param arr
     * @return
     */
    private static Integer countAllNum(int[] arr) {
        File file = new File("Day0913/src/assignment", "countAllNum.txt");

        int sum = 0;
        try (FileOutputStream fOut = new FileOutputStream(file);
             FileInputStream fIn = new FileInputStream(file);
        ) {
            //先转String 再转byte，直接导入int 不能计算1位以上的数
            String str = Arrays.toString(arr);
            byte[] bytes = str.getBytes();
            for (byte i : bytes) {
                fOut.write(i);
            }
            fOut.flush();

            byte[] inputBytes = fIn.readAllBytes();
            String input = new String(inputBytes, "utf8");
            String[] split = input.split(",");
            for (String s : split) {
                String temp = s;
                if (temp.contains("[")) {
                    temp = temp.replace("[", "");
                } else if (temp.contains("]")) {
                    temp = temp.replace("]", "");
                }
                if (temp.contains("")) {
                    temp = temp.replace(" ", "");
                }
                if (!(temp.isBlank())) {
                    sum += Integer.parseInt(temp);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sum;
    }


}
