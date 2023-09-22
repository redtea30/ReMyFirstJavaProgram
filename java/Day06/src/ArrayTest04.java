import java.util.Scanner;

/**
 * ClassName:ArrayTest04
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 7/8/202312:05 pm
 * @Version 1.0
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        // 输入 n 输出前 n 个数 存储到数组 再输出
        //generate fibonacci numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number length of fibonacci numbers");
        int fibonacciLength = scanner.nextInt();
        int[] fibonacci = new int[fibonacciLength];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        if (fibonacciLength == 1) {
            System.out.println("the" + 1 + "number is" + 1);
        } else if (fibonacciLength == 2) {
            System.out.println("the" + 1 + "number is" + 1);
            System.out.println("the" + 2 + "number is" + 1);
        } else {
            for (int i = 2; i < fibonacciLength; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        for (int i = 0; i < fibonacciLength; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}
