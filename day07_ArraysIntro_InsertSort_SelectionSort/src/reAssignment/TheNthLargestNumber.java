package reAssignment;

import java.util.Arrays;

/**
 * ClassName:TheNthLargestNumber
 * Package: reAssignment
 * Description:
 *
 * @Author Neko
 * @Create 9/8/202312:09 pm
 * @Version 1.0
 */
public class TheNthLargestNumber {
    public static void main(String[] args) {
        // 给定一个整数数组，输入一个值 n, 输出数组中第 n 大的数。
        int[] arr = {12, 23, 34, 19, 25, 17, 23, 17, 19};
        //排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//貌似直接改这里的大小符号就能变顺序，用不着费劲巴拉的倒排，妈的
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
