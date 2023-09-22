import java.util.Arrays;

/**
 * ClassName:PrimeFactor
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 14/8/20234:34 pm
 * @Version 1.0
 */
public class PrimeFactor {
    public static void main(String[] args) {
        int num = 17;
        System.out.println(Arrays.toString(primeFactorList(num)));

    }

    public static int[] primeFactorList(int num) {
        int[] primeList = primeList(num);
        int count = 0;
        int[] factor = new int[0];

        int temp = num;
        for (int j = 0; j < primeList.length; j++) {
            if (temp % primeList[j] == 0) {
                count++;
                temp = temp / primeList[j];
                factor = Arrays.copyOf(factor, count);
                factor[count - 1] = primeList[j];
                j--;//再来一遍看是不是质因数
            }
        }
        return factor;

    }


    public static int[] primeList(int num) {
        //查找当前数字因数中的所有质数
        //排序，从大到小
        int count = 0;
        int[] arr = new int[0];
        for (int i = num; i > 1; i--) {//倒序存入表中
            if (isPrime(i) && num % i == 0) {//这个数是否是质数
                count++;
                arr = Arrays.copyOf(arr, count);//自动扩展数组
                arr[count - 1] = i;
            }
        }
        return arr;

    }

    public static boolean isPrime(int num) {
        //检测是否是质数
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
