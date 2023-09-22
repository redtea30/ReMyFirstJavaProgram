/**
 * ClassName:Multiply1To10
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202311:46 am
 * @Version 1.0
 */
public class Multiply1To10_oddnumbers {

    public static void main(String[] args) {
        //编写一个循环，计算并输出从 1 到10之间所有奇数的乘积
        int count = 1;

        for (int i = 1; i < 11; i += 2) {
            count *= i;
        }
        System.out.println(count);//945

    }
}
