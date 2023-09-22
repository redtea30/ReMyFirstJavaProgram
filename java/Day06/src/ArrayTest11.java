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
public class ArrayTest11 {
    public static void main(String[] args) {
        //冒泡排序正序
        int[] arr = new int[]{6, 7, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
