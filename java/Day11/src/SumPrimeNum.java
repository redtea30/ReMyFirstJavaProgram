/**
 * ClassName:PrimeNumSum
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 14/8/20239:34 am
 * @Version 1.0
 */
public class SumPrimeNum {
    public static void main(String[] args) {
        primeNum(100);
    }

    public static void primeNum(int size) {
        int sum = 0;
        for (int i = 1; i < size; i++) {
            if (i == 2) {
                System.out.print(2 + "\t");
                sum += 2;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (j == i - 1) {
                    System.out.print(i + "\t");
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
