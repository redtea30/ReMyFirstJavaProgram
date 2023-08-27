package review;

import java.util.Arrays;

/**
 * ClassName:InsertSort
 * Package: review
 * Description:
 *
 * @Author Neko
 * @Create 25/8/202310:54 pm
 * @Version 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 9, 8, 7};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int prev = i - 1;
            int current = arr[i];
            while (prev > 0 && current < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[++prev] = current;//到这里就是没有比current更小的数了
        }
    }
}
