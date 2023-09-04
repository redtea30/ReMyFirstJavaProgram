/**
 * ClassName:Singleton1
 * Package: PACKAGE_NAME
 * Description:懒汉式，先创建对象，后进行赋值
 *
 * @Author Neko
 * @Create 4/9/20233:36 pm
 * @Version 1.0
 */
public class Singleton1 {
    Singleton1() {
    }

    private static Singleton1 instance;

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
