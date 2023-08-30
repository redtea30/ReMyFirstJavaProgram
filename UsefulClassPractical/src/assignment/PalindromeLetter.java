package assignment;

import java.util.Scanner;

/**
 * ClassName:PalindormeLetter
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 23/8/20237:56 pm
 * @Version 1.0
 */
public class PalindromeLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("请输入回文数序列,退出请输入quit");
            String str = scanner.next();
            if (str.equals("quit")) break;
            if (isPalindromeLetter(str)) System.out.println("这是一个回文数");
            else System.out.println("这不是回文数");

        }
        scanner.close();

    }

    /**
     * 回文数检测
     *
     * @param str
     * @return
     */
    static boolean isPalindromeLetter(String str) {
        //char数组验证
        char[] char1 = str.toCharArray();
        for (int i = 0, j = char1.length - 1; i < j; i++, j--) {
            if (!(char1[i] == char1[j])) return false;
        }
        //截取字符串验证
        for (int i = 0, j = char1.length - 1; i < j; i++, j--) {
            String header = str.substring(i, i);
            String footer = str.substring(j, j);
            if (!(footer.equals(header))) return false;
        }
        //charAt
        //charAt不能忘记赋值
        for (int i = 0, j = char1.length - 1; i < j; i++, j--) {
            String header = Character.toString(str.charAt(i));
            String footer = Character.toString(str.charAt(j));
            if (!(footer.equals(header))) return false;
        }


        return true;
    }


}
