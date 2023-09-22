package Teacher;

public class InsertSort {

    public static void main(String[] args) {
        // 插入排序
        int[] nums = {2, 8, 9, 7, -1, 2, 0};
        insertSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length  - 1; i++) {
            int temp = arr[i + 1];
            int index = i;
            for (; index >= 0 && temp < arr[index]; index--) { // 用 i + 1 位的比较 index 前面的所有位  如果比它小 交换位置
                arr[index + 1] = arr[index];
            }
            arr[index + 1] = temp;
        }
    }
}
