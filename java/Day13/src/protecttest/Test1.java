package protecttest;

import com.redtea30.myproject.Test;

/**
 * ClassName:Test1
 * Package: protecttest
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20233:34 pm
 * @Version 1.0
 */
public class Test1 extends Test {

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.test2();
    }

    protected void test2() {
        //这个在测试protected权限，需要在方法内调用super父类
        super.test2();
        System.out.println("super.test2()");
    }
}
