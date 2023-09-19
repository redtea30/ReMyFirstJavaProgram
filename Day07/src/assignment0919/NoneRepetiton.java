package assignment0919;

import java.util.Arrays;

/**
 * ClassName:ArrayCancelTheSameElements
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 8/8/20238:09 pm
 * @Version 1.0
 */
public class NoneRepetiton {
    public static void main(String[] args) {
        //给定一个整数数组，编写一个程序，移除数组中的重复元素，输出一个去重后的数组。
        int[] arr = new int[]{72, 23, 64, 64, 64, 35, 86, 35, 64, 60, 43, 64, 34, 64, 64, 64, 64, 34, 64, 64};
        int noneRepetition = arr.length - 1;//原数组长度
        boolean flag = false;

        for (int i = 0; i < noneRepetition + 1; i++) {

            for (int j = 0; j < noneRepetition + 1; j++) {
                if (arr[i] == arr[j] && i != j) {

                    for (int k = j; k < noneRepetition; k++) {
                        arr[k] = arr[k + 1];
                    }
/*                    while (j < noneRepetition) {
                        arr[j] = arr[j + 1];
                        j++;
                    }*/
                    //这里有问题，使用for循环可以去重
                    noneRepetition--;

                }
            }
        }


        int[] arr2 = Arrays.copyOf(arr, noneRepetition);
        System.out.println(Arrays.toString(arr2));


    }


}

