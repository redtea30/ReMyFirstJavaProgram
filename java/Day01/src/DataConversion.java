import org.junit.jupiter.api.Test;

/**
 * ClassName:DataConversion
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 31/7/20234:04 pm
 * @Version 1.0
 */


public class DataConversion {

    @Test
    public void test1() {
        //auto-conversion
        byte data = 12;
        short data1 = data;
        int data2 = data1;
        long data3 = data2;
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
/*        12
        12
        12
        12*/
    }

    @Test
    public void test2() {
        long data1 = 2100000000000L;
        short data2 = (short) data1;
        int data3 = (int) data2;
        byte data4 = (byte) data3;
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
    }

    @Test
    public void test3() {
        int num1 = 2;
        int num2 = 3;
        int num3 = ++num1;
        System.out.println(num1 + num2 + num3);
        System.out.println(--num1 + ++num2 + ++num3);
        System.out.println(num1 + num2 + num3);


    }

    @Test
    public void test4() {
        //练习
//        9. 判断一个数是否是偶数
        int num1 = (int) (Math.random() * 100);
        // math.random()生成double类型的数据，必须强转
        if (num1 % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("不是��数");
        }


//        10. 使用三元运算符计算两个整数中的较大值

        int num2 = 10;
        int num3 = 20;
        System.out.println(num2 > num3 ? num2 : num3);


    }

}