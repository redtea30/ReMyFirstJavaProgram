import java.util.Arrays;

/**
 * ClassName:SelectionSort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 14/8/202310:37 am
 * @Version 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 11, 5, 4, 2, 6, 4};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {//后一个循环
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
