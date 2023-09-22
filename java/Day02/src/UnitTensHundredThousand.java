import java.util.Scanner;

/**
 * ClassName:UnitTensHundredThousand
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20232:24 pm
 * @Version 1.0
 */

public class UnitTensHundredThousand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个四位数字");
        int number = input.nextInt();
        int thousand = number / 1000;
        int hundred = number / 100 % 10;
        int tens = number / 10 % 10;
        int unit = number % 10;
        System.out.println(thousand + "-千位  " + hundred + "-百位   " + tens + "-十位   " + unit + "-个位");

    }
}
