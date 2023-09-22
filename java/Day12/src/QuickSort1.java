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
public class QuickSort1 {
    public static void main(String[] args) {
        int arr[] = {9, 8, 6, 5, 4, 7, 3, 1, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (!(start < end)) {
            return;//此时是终止条件
        }
        int pivot = arr[start];//基准值
        int left = start;
        int right = end;

        //两个指针向中间移动，把比pivot大的放右边，比pivot小的放左边，两个指针重叠时一定等于或小于pivot
        while (left < right) {
            //从右开始，找比基准值小的数字
            while (left < right && arr[right] > pivot) {
                right--;
            }
            //从左开始向右找比基准值大的
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            //直接进行交换就行，此时arr[left]一定小于arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //交换基准值和指针位置的数据
        arr[start] = arr[left];
        arr[left] = pivot;
        //对两边的数据进行递归
        //基准值是两指针此时所在位置，跳过
        quickSort(arr,start,left-1);
        quickSort(arr,left+1,end);
    }
}
