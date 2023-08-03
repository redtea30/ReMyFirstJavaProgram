/**
 * ClassName:PrimeNumber
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20234:22 pm
 * @Version 1.0
 */
public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {//初始值不可以设为0
                if (i % j == 0) {
                    count++;
                    if (count > 2) {
                        break;
                    }
                }
            }
            if (count == 2) {
                System.out.println(i);
            }

        }


    }
}
