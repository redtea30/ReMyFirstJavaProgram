package review;

import java.util.Arrays;

/**
 * ClassName:QuickSort
 * Package: review
 * Description:
 *
 * @Author Neko
 * @Create 25/8/202310:19 pm
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 9, 8, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 优化快排算法，自己思考的
     * 主要去除了多余的判断机制
     * 可能有的问题，可读性较差，
     *
     * @param sort
     * @param start
     * @param end
     */
    public static void quickSort(int[] sort, int start, int end) {
        if (start >= end) return;//这里是最终截至条件，没有该判断就会一直执行下去
        int left = start;
        int right = end;
        int pivot = sort[start];
        while (left < right) {
            while (left < right && sort[right] >= pivot) right--;
            while (left < right && sort[left] <= pivot) left++;
            int temp = sort[left];
            sort[left] = sort[right];
            sort[right] = temp;
        }
        sort[start] = sort[left];
        sort[left] = pivot;

        quickSort(sort, start, left - 1);
        quickSort(sort, right + 1, end);

    }
}
