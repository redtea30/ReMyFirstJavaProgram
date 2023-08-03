/**
 * ClassName:SumEvenNum1To100
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202311:42 am
 * @Version 1.0
 */
public class SumEvenNum1To100 {
    public static void main(String[] args) {
        //编写一个循环，计算并输出从 1 到 100 之间所有偶数的和
        int count = 0;
        for (int i = 0; i < 101; i += 2) {//改变循环变量的值貌似可以放在循环体了里面
            count += i;
            System.out.println(i);
        }
        System.out.println(count);
    }
}
