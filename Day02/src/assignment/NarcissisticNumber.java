package assignment;

import java.util.Scanner;

/**
 * ClassName:NarcissisticNumber
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20236:51 pm
 * @Version 1.0
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        // 从键盘上输入一个三位数，判断是否是水仙花数，是输出true，不是输出false 水仙花：各个位上的数字的立方和等于该数本身
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int narcissistic = scanner.nextInt();
        int unit = narcissistic % 10;
        int tens = narcissistic / 10 % 10;
        int hundred = narcissistic / 100 % 10;
        boolean istrue = (unit * unit * unit + tens * tens * tens + hundred * hundred * hundred) == narcissistic;
        //153测试结果位true
        System.out.println(istrue);


        scanner.close();

    }
}
