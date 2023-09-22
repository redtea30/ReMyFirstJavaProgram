import java.util.Scanner;

/**
 * ClassName:SwitchCase02
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20232:52 pm
 * @Version 1.0
 */
public class SwitchCase02 {
    public static void main(String[] args) {
        // 先输入年份，在输入一个月份，返回这个月多少天
        // 31 30 29 2831 1,3,5,7,8,10,12 30 4，6 ，9，11 2 年29天 平年 28天
        int feb = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    feb = 29;
                }
            }
            feb = 29;
        } else {
            feb = 28;
        }

        System.out.println("请输入一个月份");
        int month = scanner.nextInt();

        // break 不能忘记放
        // 还有 default
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31天");
                break;
            case 4, 6, 9, 11:
                System.out.println("30天");
                break;
            case 2:
                System.out.println(feb + "天");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
