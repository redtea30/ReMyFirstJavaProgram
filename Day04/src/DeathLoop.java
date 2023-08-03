import java.math.BigDecimal;

/**
 * ClassName:DeathLoop
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202310:25 am
 * @Version 1.0
 */
public class DeathLoop {

    public static void main(String[] args) {
        int i = 2;
        double l = 5;
        BigDecimal num1 = new BigDecimal("2");
        BigDecimal num2 = new BigDecimal("1.000000000000000000000000000000000000001");

        while (i < 3) {
            num1 = num1.multiply(num2);
            System.out.println(num1);
        }
    }
}
