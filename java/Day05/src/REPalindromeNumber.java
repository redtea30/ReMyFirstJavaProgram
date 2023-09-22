import java.util.Scanner;

/**
 * ClassName:PalindromeNumber
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/8/202311:12 am
 * @Version 1.0
 */
public class REPalindromeNumber {
    public static void main(String[] args) {
        //输入一个数字，和位数，判断这个数是否回文数字1221是回文数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字，建议以xxxyyy/xxyyzzzzyyzz的形式");
        int input = scanner.nextInt();
        System.out.println("输入位数");
        int digit = scanner.nextInt();

        //回文数字，首末每一位相等
        //11222211
        //1221

        boolean flag = true;
        int head;
        int tail;
        for (int i = 1; i <= (digit / 2); i++) {

            int weight = (int) Math.pow(10, digit - i);
            head = (input / weight) % 10;
            tail = (input % (int) (Math.pow(10, i))) / (int)(Math.pow(10, i - 1));
            if (head != tail) {
                flag = false;
            }
            if (i == digit / 2) break;

        }
        if (flag) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not palindrome number");
        }

    }

}



