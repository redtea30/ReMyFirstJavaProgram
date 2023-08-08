/**
 * ClassName:PreClassTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 8/8/20239:15 am
 * @Version 1.0
 */
public class PreClassTest {
    public static void main(String[] args) {

        int sum = 2;
        for (int i = 2; i < 101; i++) {
            for (int j = 2; j <= i >> 1; j++) {//妈的，又忘记符号了
                if (i % j == 0) break;
                else if (j == i >> 1) sum += i;
            }
        }
        System.out.println(sum);
    }
}
