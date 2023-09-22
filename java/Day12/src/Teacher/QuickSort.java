package Teacher;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        // 快排
        int[] nums = {2, 7, 9, 0, -1, 2, -9};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int jiZhun = arr[left];
        int i = left;//右指针
        int j = right;//左指针
        while (i != j) {//这里有争议，我觉得应该i<j比较合适，大哥说i一定会等于j
            // 找到比基准值小的下标
            while (j > i && arr[j] >= jiZhun) {//右指针
                j --;
            }
            // 找到比基准值大的下标
            while (j > i && arr[i] <= jiZhun) {//左指针
                i ++;
            }
            if (i < j) {//这里的判断不必要？
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
            }
        }
            //这里的判断不必要，j停下的时候，j一定小于基准值
        if (arr[i] < jiZhun) {//这里的arr[i]或者arr[j]都可以，此时i==j；
            arr[left] = arr[i];
            arr[i] = jiZhun;
        }
        // 数组以 i 下标分成左边 和右边两部分   i 左边 小于 基准值  i 右边比基准值大
        // 排序左边
        quickSort(arr, left, i - 1);
        //排序右边
        quickSort(arr, i + 1, right);
    }
}
