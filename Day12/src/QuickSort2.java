import java.util.Arrays;

/**
 * ClassName:QuickSort1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/202311:53 am
 * @Version 1.0
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = {9, 8, 6, 5, 4, 7, 3, 1, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;
        int pivot = arr[start];

        while (left < right) {
            while (left < right && arr[right] > pivot) right--;
            while (left < right && arr[left] <= pivot) left++;
            //这里一定是可以交换的
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
        arr[start] = arr[left];
        arr[left] = pivot;

        quickSort(arr,0,left-1);
        quickSort(arr,left+1,end);
    }
}
