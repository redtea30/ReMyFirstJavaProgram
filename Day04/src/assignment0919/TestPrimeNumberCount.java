package assignment0919;

/**
 * ClassName:TestPrimeNumberCount
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 4/8/202310:18 am
 * @Version 1.0
 */
public class TestPrimeNumberCount {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(i);
            }
        }


    }
}
