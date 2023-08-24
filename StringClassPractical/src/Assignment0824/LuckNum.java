package Assignment0824;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName:LuckNum
 * Package: Assignment0824
 * Description:
 *
 * @Author Neko
 * @Create 24/8/20237:20 pm
 * @Version 1.0
 */
public class LuckNum {
    static int[] arr = new int[40];
    static Random rand = new Random();
    static int[] finalArr = new int[20];

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLucky()));

    }

    /**
     * 先生成40位的数组，然后洗牌，就酱
     *
     * @return
     */
    public static int[] getLucky() {
        for (int i = 0; i < 40; i++) {
            arr[i] = i + 1;
        }
        int count = 0;
        do {
            int random = rand.nextInt(40);
            finalArr[count++] = arr[random];
            if (arr[random] == 0) {
                count--;
                continue;
            }
            if (arr[random] != 0) arr[random] = 0;
        } while (count < 20);
        return finalArr;
    }
}
