package assignment;

import java.util.Arrays;

/**
 * ClassName:ArrayAddElement
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 8/8/202310:39 pm
 * @Version 1.0
 */
public class ArrayAddElement {
    public static void main(String[] args) {
        //给定一个整数数组，输入位置 n 和值 k。将值 k 插入到数组的第 n 位并输出新数组的每一个元素。
        //例如：
        //int[] arr = {2, 3, 1, 8, 3, 9, 6};
        //输入 n 为 3 , k 为 10 ，新数组为 [2, 3, 10, 1, 8, 3, 9, 6]

        int[] arr = {2, 3, 1, 8, 3, 9, 6};
        int n = 3;//第三个位置，从1开始数
        int k = 10;//值

        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < 2) {
                arr2[i] = arr[i];
            } else if (i == n - 1) {
                arr2[i] = k;
            } else {
                arr2[i] = arr[i - 1];
            }
        }


            System.out.print(Arrays.toString(arr2));

    }
}
