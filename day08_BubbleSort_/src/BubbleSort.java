import java.util.Arrays;

/**
 * ClassName:Bubblesort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 9/8/202311:43 am
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{72, 23, 64, 64, 64, 35, 86, 35, 64, 60, 43, 64, 34, 64, 64, 64, 64, 34, 64, 64};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j+1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
