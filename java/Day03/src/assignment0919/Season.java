package assignment0919;

import java.util.Scanner;

/**
 * ClassName:Season
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20236:40 pm
 * @Version 1.0
 */
public class Season {
    public static void main(String[] args) {
        //编写一个程序，根据用户输入的月份（1 到 12），输出该月份所属的季节。假设春季 是 3 到 5 月，夏季是 6 到 8 月，秋季是 9 到 11 月，冬季是 12、1 和 2月。如果输入 的月份超出了范围，输出"输入错误"。

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入月份");
        int month = scanner.nextInt();
        switch (month) {
            case 12, 1, 2 -> System.out.println("是冬季");
            case 3, 4, 5 -> System.out.println("是春季");
            case 6, 7, 8 -> System.out.println("是夏季");
            case 9, 10, 11 -> System.out.println("是秋季");
            default -> System.out.println("你输入的有误");

        }


    }
}
