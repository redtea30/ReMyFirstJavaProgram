package pre_class_test;

import java.util.Arrays;

/**
 * ClassName:QuickSOrt
 * Package: pre_class_test
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20239:21 am
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 7, 2, 3, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (!(start < end)) return;
        int left = start;
        int right = end;
        int pivot = arr[start];
        while (left < right) {
            while (left < right && arr[right] > pivot) right--;
            while (left < right && arr[left] <= pivot) left++;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        if (arr[left] < pivot) {
            arr[start] = arr[left];
            arr[left] = pivot;
        }
        quickSort(arr, start, left - 1);
        quickSort(arr, right + 1, end);

    }

}

