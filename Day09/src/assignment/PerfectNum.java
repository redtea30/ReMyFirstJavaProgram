package assignment;

/**
 * ClassName:PerfectNum
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 10/8/20238:45 pm
 * @Version 1.0
 */
public class PerfectNum {
    public static void main(String[] args) {
        //编写一个Java程序，使用循环输出所有的完美数。完美数是等于其所有因子之和的正整数，如6 = 1 + 2+3
        //reference
        //https://blog.csdn.net/seagal890/article/details/79329514
        int count = 0;
        for (long i = 2; i < (long) (Math.pow(10, 60)); i += 2) {//完美数都是偶数
            long sum = 0;
            for (long j = 1; Math.pow(j, 2) < i; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (j * j != i) {
                        sum += i / j;
                    }
                }
            }
            sum -= i;//第一个因数是1的时候，对应的另一个因数是本身，需要减掉
            if (sum == i) {
                System.out.println(i);
            } else if (i % 1000000 == 0) {
                System.out.println("已过" + (++count) + "百万位");
            }
        }
    }
}
