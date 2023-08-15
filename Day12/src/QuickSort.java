import java.util.Arrays;

/**
 * ClassName:QuickSort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/202311:12 am
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 0, -1, 2, -9};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {//限制条件，不然会栈溢出
            return;
        }
        int pivot = arr[low];
        int start = low;
        int end = high;

        while (start < end) {
            while (start < end && arr[end] > pivot) {
                end--;
            }
            while (start < end && arr[start] <= pivot) {
                start++;
            }
            //俺觉得可以直接交换
            //这里end一定大于start
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //arr[low]此时还是基准值，arr[start]此时小于arr[low],进行交换
        arr[low] = arr[start];
        arr[start] = pivot;//基准值赋予指针最后的位置

        quickSort(arr, low, start - 1);
        quickSort(arr, start + 1, high);

    }
}
