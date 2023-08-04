package RE;

/**
 * ClassName:RePrimeNumber
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20235:35 pm
 * @Version 1.0
 */
public class RePrimeNumber {
    public static void main(String[] args) {
        //接收用户输入的数字,判断在此范围内质数的个数，例如输入90，输出0-90以内的所有质数的数量
        //素数（质数）的条件，只能被1和本身整除
        //1不是质数
        int input = 100;//25

        int count = input >= 2 ? 1 : 0;
        for (int i = 2; i <=input; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {//这里跳过2，所以前面才加一
                    break;
                }
                if (j == i - 1) count++;
            }

        }
        System.out.println(count);

    }
}
