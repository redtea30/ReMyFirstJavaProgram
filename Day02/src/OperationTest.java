import org.junit.jupiter.api.Test;

/**
 * ClassName:OperationTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 1/8/202310:49 am
 * @Version 1.0
 */
public class OperationTest {

    @Test
    public void test1() {
        //目标：掌握基本的算术运算符的使用。
        int a = 3;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a << b);
        System.out.println(a * 2 * 2 * 2 * 2);
        // 位运算结果相当与*2
        System.out.println(a >> b);
        // 最小值二进制0000，0000，0000，0000即0

    }

    @Test
    public void test2() {
        //目标2：掌握使用+符号做连接符的情况
        int a = 3;
        System.out.println(a + 'a');
        System.out.println(a + 5);
        System.out.println("test" + a + 'a');
        System.out.println(a + 'a' + "test");
/*      100
        8
        test3a
        100test*/

    }

    @Test
    public void test3() {
        //1.单独使用：++或者--放在变量前面没有区别
        int a = 10;
        a++;//11
        --a;//10
        System.out.println(a);//10
    }

    @Test
    public void test4() {
        //.混合使用：++或者--放在变量或者前面运算规则稍有不通过 ++ 在后 先赋值 再自增 ++ 在前 先自增再赋值
        int a = 10;
        int b = a++;//10
        int c = ++a;//11
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int d = 2;
        d = d++;//2
        System.out.println(d);

        int e = 2;
        e = ++e;//3
        System.out.println(e);

        int f = 5;
        int g = 5;
        System.out.println(f = g);
    }

    @Test
    public void test5() {
        int a = 10;
        ++a;
        System.out.println(a);//11

        --a;
        System.out.println(a);//10

        //先++
        int i = 10;
        int j = ++i;
        System.out.println(j);
        System.out.println(i);

        //后++
        int b = 10;
        int c = b++;
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void test6() {
        //自增自减运算
        int num1 = 2;
        int num2 = 3;
        int num3 = ++num1;//num1=3 num3=3
        System.out.println(++num1 + num2++ + num3);
        //4 +   3(4) +  3=10
        System.out.println(--num1 + num2-- + --num3);
        //3   +  4(3)  + 2 =9
        System.out.println(num1-- + num2-- + --num3);
        //3(2) + 3(2)  +  1 = 7
    }

    @Test
    public void test7() {
        //赋值运算符
        // 目标：掌握扩展赋值运算符的使用。
        // +=
        double a = 9.5;
        int b = 520;
        a += b;//自动类型提升
        System.out.println(a);//529.5

        double c = 9.5;
        int d = 520;
        d += c;//强制转换 d=(int)(c+d) 去除小数
        System.out.println(d);//529

        // -= 需求：发红包
        double i = 600;
        double j = 520;
        i -= j;
        System.out.println(i);//80.0


        int m = 10;
        int n = 5;
        //m *= n;//50
        //m/=n;//m = m/n   m=2
        m %= n;//m=m%n;   m=0
        System.out.println(m);
    }

    @Test
    public void test8() {
        //问题1：下面的代码否有问题
        byte x = 10;
        byte y = 30;
        //x = x + y;
        // 报错 byte char short 转换成int类型进行计算
        System.out.println(x);
    }

    @Test
    public void test9() {
        //问题2：下面的代码是否有问题？
        byte x = 10;
        byte y = 30;
        // x += 3;
        x += y; // x = (byte) (x + y); 相当于强制类型转换
        System.out.println(x); // 40

    }

    @Test
    public void test10() {
        int a = 10;
        int b = 5;
        System.out.println(a = b);

    }


    @Test
    public void test11() {
        //负数位运算
        System.out.println(-12 | 3);//-9


    }

}
