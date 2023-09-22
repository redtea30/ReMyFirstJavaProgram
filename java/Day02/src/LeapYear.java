import java.util.Scanner;

/**
 * ClassName:LeapYear
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 1/8/202312:44 pm
 * @Version 1.0
 */
public class LeapYear {
    public static void main(String[] args) {
        //闰年可以被4整除但不能被100整除，或者被400整除
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = scanner.nextInt();
        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(isLeap);
        if (isLeap) {
            System.out.println("你输入的年份" + year + "是闰年");
        } else {
            System.out.println("你输入的年份不是闰年");
        }

    }
}
