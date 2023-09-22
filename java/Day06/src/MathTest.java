/**
 * ClassName:MathTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 7/8/202310:45 am
 * @Version 1.0
 */
public class MathTest {
    public static void main(String[] args) {

        //未完，随机测试
        int i = -123;
        int j = Math.abs(123);
        System.out.println("Math.abs" + j);

        j = -123;
        i = 456;
double k = 456.9999999999999999;
        System.out.println(Math.nextDown(i));
        System.out.println(Math.nextUp(i));
        System.out.println(Math.PI);
        System.out.println(Math.ceil(i));

        System.out.println("Math.copySign"+Math.copySign(i,j));

        System.out.println("Math.decrementExact"+Math.decrementExact(i));
        System.out.println("Math.floor"+Math.floor(k));//457.0 向上取
        System.out.println("Math.nextUp"+Math.nextUp(k));
        System.out.println("Math.ulp"+Math.ulp(k));//最小精度单位？？？
    }
}
