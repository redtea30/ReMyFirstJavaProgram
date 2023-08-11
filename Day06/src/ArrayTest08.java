import java.util.Arrays;

/**
 * ClassName:ArrayTest07
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 11/8/20238:43 am
 * @Version 1.0
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 7, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            //交换
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
