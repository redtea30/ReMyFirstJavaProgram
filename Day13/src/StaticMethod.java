/**
 * ClassName:StaticMethod
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 16/8/202311:04 am
 * @Version 1.0
 */
public class StaticMethod {
    static int day = 0;

    public static void test() {
        day++;
    }

    public static void main(String[] args) {
        StaticMethod sm1 = new StaticMethod();
        StaticMethod sm2 = new StaticMethod();
        StaticMethod sm3 = new StaticMethod();
        sm1.day++;
        sm2.day++;
        sm3.day++;
        StaticMethod.day++;
        day++;
        System.out.println(day);
        test();
        StaticMethod.test();
        sm1.test();
        System.out.println(day);
    }
}
