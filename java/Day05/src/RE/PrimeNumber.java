package RE;

/**
 * ClassName:PrimeNumber
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20235:21 pm
 * @Version 1.0
 */
public class PrimeNumber {
    public static void main(String[] args) {
        //接收用户输入的数字,判断在此范围内质数的个数，例如输入90，输出0-90以内的所有质数的数量
        //素数（质数）的条件，只能被1和本身整除
        //1不是质数


        int input = 100;//25
        int sum = 0;
        for (int i = 2; i <= input; i++) {//素数判断从2开始
            int count = 0;
            for (int j = 2; j < i; j++) {//排除1和本身
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count != 0) {
                continue;
            }
            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }
}
