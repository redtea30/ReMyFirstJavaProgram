/**
 * ClassName:PrimeFactor
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/202312:15 pm
 * @Version 1.0
 */
public class PrimeFactor {
    public static void main(String[] args) {
        //直接对num进行因式分解
        //检测因数是否是质数
        //是质数直接对num进行整除并继续检测，直到num==1时停止

        int num = 99;
        primeFactor(num);

        isPrime(99);
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
            else if (num == 2) {
                return true;
            }
        }
        return true;
    }

    public static void primeFactor(int num) {
        if (!isPrime(num)) {//检测是否一定需要
            System.out.println("num");
        }
        System.out.print(num + " = ");
        for (int i = num - 1; i >= 2; i--) {
            if (num % i == 0 && isPrime(i)) {
                if (num == 1) {
                    System.out.print(i);
                    return;
                } else System.out.print(i + " * ");
                num /= i;
                i--;
            }
        }


    }

}
