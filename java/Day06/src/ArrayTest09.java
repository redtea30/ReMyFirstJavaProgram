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
public class ArrayTest09 {
    public static void main(String[] args) {
        //插入排序，正序
        int[] arr = new int[]{6, 7, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int prev = i - 1;
                int current = arr[i];
                while (prev >= 0 && current < arr[prev]) {
                    arr[prev + 1] = arr[prev];
                    prev--;
                }
                arr[prev + 1] = current;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
