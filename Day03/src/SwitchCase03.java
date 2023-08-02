import java.util.Scanner;

/**
 * ClassName:SwitchCase03
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20233:29 pm
 * @Version 1.0
 */
public class SwitchCase03 {
    public static void main(String[] args) {
        // 先输入年份，在输入一个月份，返回这个月多少天
        // 31 30 29 2831 1,3,5,7,8,10,12 30 4，6 ，9，11 2 年29天 平年 28天

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = scanner.nextInt();

        int days = 0;
        System.out.println("请输入一个月份");
        int month = scanner.nextInt();
        days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> -1;
            //default 不能忘记加
        };
        if (days == -1) {
            System.out.println("你输入的有误");
        }
        else {
            System.out.println(year+"年 "+month+"月 有"+days+"天");
        }

    }
}
