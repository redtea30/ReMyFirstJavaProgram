import java.util.Arrays;

/**
 * ClassName:quickSort1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 14/8/202310:52 pm
 * @Version 1.0
 */
public class quickSort1 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 2, 6, 7, 9, 11, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int position = partition(arr, start, end);
            quickSort(arr, start, position - 1);
            quickSort(arr, position + 1, end);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int pivot = arr[low];

        while (left < right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            while (left < right && arr[left] < pivot) {
                left++;
            }
            if (left < right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }
        arr[left] = arr[right];
        arr[right] = pivot;
        return right;

    }
}
