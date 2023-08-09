import java.util.Arrays;
import java.util.Random;

/**
 * ClassName:RandomList
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 9/8/20234:41 pm
 * @Version 1.0
 */
public class RandomList {
    public static void main(String[] args) {
        //数列随机化
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 34, 35, 43, 44, 60, 64, 72, 79, 86};


        Random random = new Random();

        for (int i = 0; i < arr.length ; i++) {
            int index = random.nextInt(arr.length);//通过random为数列进行重排序
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }


        System.out.println(Arrays.toString(arr));

    }
}
