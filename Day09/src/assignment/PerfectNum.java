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
int count = 0;
        for (long i = 1; i < (long) (Math.pow(10, 60)); i++) {
            long sum = 0;
            for (long j = 1; j <= i>>1; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }else if(i%100000==0){
                System.out.println("已过"+(++count)+"十万");
            }


        }


    }
}
