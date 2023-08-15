/**
 * ClassName:first_Fibonacci
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 14/8/202311:23 pm
 * @Version 1.0
 */
public class first_Fibonacci {
    public static void main(String[] args) {
        //题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
        //这是一个菲波拉契数列问题
        int month = 7;
        int rabbitNum = recursion(month);
        System.out.println(rabbitNum);
    }

    public static int recursion(int month) {
        if (month < 3 && month > 0) {
            return 1;
        } else {
            return recursion(month - 1) + recursion(month - 2);
        }

    }

}
