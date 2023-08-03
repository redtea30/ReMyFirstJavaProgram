/**
 * ClassName:PowOf1To10
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202311:39 am
 * @Version 1.0
 */

public class Pow2_Of1To10 {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (i <= 10) {
            i++;
            count += Math.pow(i, 2);
            System.out.println(i-1 + "数的平方为" + (int) Math.pow(i, 2));
        }
        System.out.println("1-10的整数平方和为" + count);
    }
}
