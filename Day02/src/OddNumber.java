/**
 * ClassName:EvenNumber
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20232:11 pm
 * @Version 1.0
 */

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        //键盘输入一个数字，判断是否是奇数。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int check = input.nextInt();
/*        if (check % 2 == 0) {
            System.out.println("你输入的数字" + check + "不是奇数");

        } else {
            System.out.println("你输入的数字" + check + "是奇数");
        }*/
        Boolean isodd = check % 2 != 0;//boolean的用法+1
        System.out.println(isodd + "是奇数");
    }
}
