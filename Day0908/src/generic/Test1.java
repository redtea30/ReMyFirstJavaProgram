package generic;

/**
 * ClassName:Test1
 * Package: generic
 * Description:泛型的基础应用一
 *
 * @Author Neko
 * @Create 8/9/20239:45 pm
 * @Version 1.0
 */
public class Test1<E, T> {

    E e;
    T t;

    E getE() {
        return e;
    }

    T getT() {
        return t;
    }

    <C> C test(C c) {
        return c;
    }


}

class Demo {
    public static void main(String[] args) {
        Test1<String, String> test1 = new Test1<String, String>();
        //前面的Test1类规定了几个值就只能塞进去几个值
        System.out.println(test1.test("这是一个测试类"));//这是一个测试类


    }
}
