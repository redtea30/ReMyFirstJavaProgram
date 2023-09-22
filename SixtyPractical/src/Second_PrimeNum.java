import java.util.Arrays;

/**
 * ClassName:Second_PrimeNum
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/20238:04 am
 * @Version 1.0
 */
public class Second_PrimeNum {
    public static void main(String[] args) {
        //题目：判断101-200之间有多少个素数，并输出所有素数。
        //程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。

        primeList(101,200);

    }

    public static void primeList(int start, int end) {
        int[] arr = new int[0];
        int count = 0;
        for (int i = start; i < end + 1; i++) {
            if (isPrime(i)) {
                count++;
                arr = Arrays.copyOf(arr, count);
                arr[count - 1] = i;
                System.out.print(i+"\t");
            }
        }
        System.out.println();
        System.out.println(start+"到"+end+"之间有"+count+"个素数");
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
