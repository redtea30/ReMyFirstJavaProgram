import java.util.Scanner;

/**
 * ClassName:Factorial
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/8/202311:05 am
 * @Version 1.0
 */
public class Factorial {
    public static void main(String[] args) {
        // 5! = 5 * 4 * 3 * 2 * 1 输入一个数，计算阶乘
        //不大会用，但是写出来了
        // 递归，调用构造方法
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于0的正整数");
        int input = scanner.nextInt();
        int result = factorial(input);
        System.out.println(result);

    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }

    }


}
