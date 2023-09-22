import java.util.Scanner;

/**
 * ClassName:Sixth
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 17/8/20238:41 am
 * @Version 1.0
 */
public class Sixth {
    public static void main(String[] args) {
        //题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
        ///在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。* /


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字m");
        //int m = scanner.nextInt();
        int m = 360;
        System.out.println("请输入数字n");
        //int n = scanner.nextInt();
        int n = 270;
        scanner.close();

        int bigger;
        bigger = m > n ? n : m;
        int smaller;
        smaller = (bigger == m) ? n : m;

        //求最大公约数
/*        while (smaller > 0) {
            int temp = smaller;
            smaller = bigger % smaller;
            if (smaller == 0) break;
            int temp = bigger;
            bigger = smaller;
            smaller = temp;
        }*/


    }
}
