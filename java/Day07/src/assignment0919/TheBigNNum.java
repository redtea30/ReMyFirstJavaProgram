package assignment0919;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:TheBigNNum
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 8/8/20239:19 pm
 * @Version 1.0
 */
public class TheBigNNum {
    public static void main(String[] args) {
        //给定一个整数数组，输入一个值 n, 输出数组中第 n 大的数。
        //例如：
        //int[] arr = {2, 3, 1, 8, 3, 9, 6};
        //有数组：
        //输入 n 的值为 4，输出 3

        int[] arr = {2, 3, 1, 8, 3, 9, 6};
        //Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {//重排
            int current = arr[i];
            int prevIndex = i - 1;
            while (prevIndex >= 0 && arr[prevIndex] > current) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = current;
        }

        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        //去重
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (arr[j] == arr[i] && i != j) {
                    while (j < length - 1) {
                        arr[j] = arr[j + 1];
                        j++;
                    }
                    length--;
                }
            }
        }

        int[] arr2 = Arrays.copyOf(arr, length);


        for (int i : arr2) {
            System.out.print(i + ", ");
        }
        System.out.println();
        outer:while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数");
            int input = scanner.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == input) {
                    int count = 1;
                    for (int num : arr2) {
                        if (num == input) {
                            System.out.println("这是第" + count + "大的数");
                            break outer;
                        }
                        count++;
                    }
                } else if (i == arr.length - 1 && arr[i] != input) {
                    System.out.println("你输入的不正确");
                    break outer;
                }
            }


        }


    }
}
