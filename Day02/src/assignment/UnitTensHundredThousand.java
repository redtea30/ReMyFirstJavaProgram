package assignment;

import java.util.Scanner;

/**
 * ClassName:UnitTensHundredThousand
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20236:45 pm
 * @Version 1.0
 */
public class UnitTensHundredThousand {
    public static void main(String[] args) {
        // 从键盘上输入一个四位整数，求各位数之和。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个四位数字");
        int num = input.nextInt();
        int unit = num % 10;
        int tens = num / 10 % 10;
        int hundred = num / 100 % 10;
        int thousand = num / 1000 % 10;
        int amount = unit + tens + hundred + thousand;
        System.out.println("总数是" + amount);

        input.close();
    }
}
