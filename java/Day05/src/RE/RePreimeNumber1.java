package RE;

/**
 * ClassName:RePreimeNumber1
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20238:17 pm
 * @Version 1.0
 */
public class RePreimeNumber1 {
    public static void main(String[] args) {
//素数个数，综合，每个素数都是啥
        int range = 100;
        int sum = 0;
        int count = range >= 2 ? 1 : 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    count++;
                    sum += i;
                    System.out.println(i);
                }
            }

        }
        System.out.println(sum + "sum" + count + "count");


    }
}
