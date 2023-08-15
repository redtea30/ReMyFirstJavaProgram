import java.util.Arrays;

/**
 * ClassName:QuickSort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 14/8/20235:22 pm
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {19, 22, 98, 100, 56, 77, 45, 72, 0, -1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start;
        int right = end;

        while (left < right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

        }
        arr[start] = arr[right];
        arr[right] = pivot;
        return right;

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int position = partition(arr, low, high);
            quickSort(arr, low, position - 1);
            quickSort(arr, position + 1, high);
        }
    }

}
