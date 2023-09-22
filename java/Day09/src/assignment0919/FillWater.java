package assignment0919;

import java.util.Arrays;

/**
 * ClassName:FillWater
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 10/8/20237:27 pm
 * @Version 1.0
 */
public class FillWater {
    public static void main(String[] args) {
        //有一个 异形 容器，用一个 n * n 的二维数组来表示。其中 1 表示容器实心部分， 0 表示
        //空心部分。现使用此容器装水，能装多少水（每个元素都表示一份水，只有有挡板的部分
        //能装水）？
        //容器示意图：
        int[][] arr = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };


        int[] height = new int[arr[0].length];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1 ? true : false) {
                    height[j] += 1;
                }
            }
        }

        System.out.println(Arrays.toString(height));
        //[1, 1, 5, 1, 8, 1, 5, 1, 1, 1]


        int water = 0;

        for (int i = 0; i < height.length; i++) {
            int h1 = 1;
            int h2 = 1;
            int multiple = 0;
            if (height[i] > 1 && i < height.length) {
                h1 = height[i];
                for (int j = i + 1; j < height.length; j++) {
                    if (height[j] != 1) {
                        h2 = height[j];
                        multiple = j - i;
                        break;
                    }
                }
            }
            if (h1 < h2) {
                h1 = h1 ^ h2;
                h2 = h1 ^ h2;
                h1 = h1 ^ h2;
            }
            water += multiple * (h1 - 1);
        }
        System.out.println(water);
        //生成不正确
    }
}
