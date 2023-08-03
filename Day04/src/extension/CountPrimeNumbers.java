package extension;

import java.util.Scanner;

/**
 * ClassName:CountPrimeNumbers
 * Package: extension
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202311:33 pm
 * @Version 1.0
 */
public class CountPrimeNumbers {
    public static void main(String[] args) {
        //接收用户输入的数字,判断在此范围内质数的个数，例如输入90，输出0-90以内的所有质数的数量
        int howMany = 0;//质数计数器
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个比1大的数字");
        int num = scanner.nextInt();
        if (num > 1) {

            for (int i = 2; i < num; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                    if (count > 2) {
                        break;
                    }
                }
                if (count <= 2) {
                    howMany++;//计数器
                    System.out.println(i);
                }

            }
        } else {
            System.out.println("你输入的不正确");
        }

        System.out.println("总共"+howMany+"个数字");

    }
}