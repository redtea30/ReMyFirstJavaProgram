/**
 * ClassName:Singleton2
 * Package: PACKAGE_NAME
 * Description:饿汉式，随类的创建而创建对象
 *
 * @Author Neko
 * @Create 4/9/20233:39 pm
 * @Version 1.0
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
