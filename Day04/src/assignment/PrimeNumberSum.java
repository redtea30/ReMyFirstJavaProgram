package assignment;

/**
 * ClassName:PrimeNumber
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20234:22 pm
 * @Version 1.0
 */
public class PrimeNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (count == 2) {
                sum += i;
                System.out.println(i + "是素数");
            }

        }

        System.out.println("总和"+sum);



    }
}
