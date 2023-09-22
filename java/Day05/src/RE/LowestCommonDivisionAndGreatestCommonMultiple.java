package RE;

/**
 * ClassName:LowestCommonDivisionAndGreatestCommonMultiple
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20236:55 pm
 * @Version 1.0
 */
public class LowestCommonDivisionAndGreatestCommonMultiple {
    public static void main(String[] args) {
        // 求指定两个数的最大公约数和最小公倍数

        // 比较大小
        // 最大公约数从两个数字 较小的开始往下去找 一直找到 1
        // 最小公倍数 从两者较大的数字开始往上找  一直找到 a * b 结束

        int num1 = 33;
        int num2 = 61;
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //一个循环寻找num1和num2 的最大公约数
        for (int i = num1; i > 0; i++) {
            if (num2 % i == 0) {
                System.out.println("最大公约数" + i);
                break;
            }
        }
        //一个循环寻找最小公倍数
        for (int i = num1; i <= (num1 * num2); i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("最小公倍数为"+i);
                break;
            }
        }

    }
}
