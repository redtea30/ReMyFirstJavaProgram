package assignment0919;

import org.junit.jupiter.api.Test;

/**
 * ClassName:Temp
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20237:12 pm
 * @Version 1.0
 */
public class ExchangeValue {
    // 定义两个整变量，交换两个变量的值。 方法1：通过位运算(异或运算) 方法2：定义临时(中间)变量
    @Test
    public void xor() {
        int a = 4;
        int b = 19;
        System.out.println("Before: a-"+a+"   b-"+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After: a-"+a+"   b-"+b);
    }

    @Test
    public void temp() {
        int a = 5;
        int b = 10;
        System.out.println("Before: a-" + a + "   b-" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After: a-" + a + "   b-" + b);


    }
}
