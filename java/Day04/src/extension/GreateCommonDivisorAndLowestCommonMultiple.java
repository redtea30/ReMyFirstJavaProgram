package extension;

import java.util.Scanner;

/**
 * ClassName:GreateCommonDivisorAndLowestCommonMultiple
 * Package: extension
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202311:22 pm
 * @Version 1.0
 */
public class GreateCommonDivisorAndLowestCommonMultiple {
    public static void main(String[] args) {
        //求指定两个数的最大公约数和最小公倍数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字1");
        int num1 = scanner.nextInt();
        System.out.println("请输入数字2");
        int num2 = scanner.nextInt();

        int num3 = num1 * num2;
        int num4 = 0;
        if (num1 < num2) {
            int t = num1;
            num1 = num2;
            num2 = t;
        }
        while (true) {
            num4 = num1 % num2;
            if (num4 == 0) break;
            else {
                num1 = num2;
                num2 = num4;
            }


        }
        System.out.println("最小公倍数" + num3/num2);
        System.out.println("最大公因数" + num2);

    }
}

