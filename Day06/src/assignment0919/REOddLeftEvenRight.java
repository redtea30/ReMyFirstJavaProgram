package assignment0919;

import java.util.Random;

/**
 * ClassName:OddLeftEvenRight
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20235:50 pm
 * @Version 1.0
 */
public class REOddLeftEvenRight {
    public static void main(String[] args) {
        //8. 定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，
        //偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）

        //自定义规则，随机数20-40
        Random random = new Random();

        int[] arr1 = new int[20];
        int[] arr2 = new int[20];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (random.nextInt(21) + 20);
            System.out.print(arr1[i] + ", ");
        }

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[index] = arr1[i];
                index++;
            } else if (arr1[i] % 2 != 0) {
                arr2[arr1.length - index] = arr1[i];
                index++;
            }
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + ", ");
        }
    }
}




