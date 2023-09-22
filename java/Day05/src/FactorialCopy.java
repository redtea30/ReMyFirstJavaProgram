import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * ClassName:Factorial
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/8/202310:52 am
 * @Version 1.0
 */
public class FactorialCopy {


    @Test
    public void testFactoria2() {

        int number = 5;
        System.out.println("方法一算得" + number + "的阶乘为：" + Wayone(number));
        System.out.println("方法二算得" + number + "的阶乘为：" + Waytwo(number));
        System.out.println("方法三算得" + number + "的阶乘为：" + Waythree(number));
        System.out.println("方法四算得" + number + "的阶乘为：" + Wayfour(number));//方法四可以传入一个较大得number值
    }

    /**
     * 普通的循环方法求阶乘
     *
     * @param num
     * @return
     */
    public static int Wayone(int num) {
        int sum = 1;
        if (num < 0) {
            throw new IllegalArgumentException("需要计算的参数必须为正数！");//抛出不合理参数异常
        }
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    /**
     * 运用递归算法求阶乘
     *
     * @param num
     * @return
     */
    public static int Waytwo(int num) {
        int sum = 1;
        if (num < 0) {
            throw new IllegalArgumentException("需要计算的参数必须为正数！");//抛出不合理参数异常
        }
        if (num == 1) {
            return 1;//跳出循环
        } else {
            sum = num * Waytwo(num - 1);//递归
            return sum;
        }
    }

    /**
     * 数组添加计算阶乘
     *
     * @param num
     * @return
     */
    public static long Waythree(int num) {
        long[] arr = new long[21];
        arr[0] = 1;
        int last = 0;
        if (num >= arr.length) {
            throw new IllegalArgumentException("传入的值太大了！");//抛出不合理参数异常
        }
        if (num < 0) {
            throw new IllegalArgumentException("需要计算的参数必须为正数！");//抛出不合理参数异常
        }
        while (last < num) {
            arr[last + 1] = arr[last] * (last + 1);
            last++;
        }
        return arr[num];
    }

    /**
     * 用BigInteger类计算阶乘
     *
     * @param num
     * @return
     */
    public static synchronized BigInteger Wayfour(int num) {
        ArrayList list = new ArrayList();
        list.add(BigInteger.valueOf(1));
        for (int i = list.size(); i <= num; i++) {
            BigInteger lastfact = (BigInteger) list.get(i - 1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(i));
            list.add(nextfact);
        }
        return (BigInteger) list.get(num);
    }
}


