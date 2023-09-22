import java.util.Arrays;

/**
 * ClassName:ArrayTest07
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 11/8/20238:43 am
 * @Version 1.0
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 7, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[maxIndex] < arr[j]) {//找到每一轮中的元素最大值
                    maxIndex = j;
                }
            }
            //交换
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
