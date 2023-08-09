package sortTest;

import java.util.Arrays;

/**
 * ClassName:InsertSort1
 * Package: sortTest
 * Description:
 *
 * @Author Neko
 * @Create 8/8/20234:56 pm
 * @Version 1.0
 */
public class InsertSort1 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i] + "before");//先打印原arr[i]
            int current = arr[i];
            int minIndex = i - 1;
            while (minIndex >= 0 && arr[minIndex] > current) {
                arr[minIndex + 1] = arr[minIndex];//这里导致for内打印不正常?
                minIndex--;
            }
            arr[minIndex + 1] = current;
            Thread.sleep(1);//与线程无关
            System.out.println(arr[i]);//这个是中间状态？是的，从44开始44>38,直到原数列arr[i]=47.由于arr[minIndex + 1] = arr[minIndex]; arr[i]==arr[i-1]
            //打印的是minIndex+1挪出来的更大值
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
