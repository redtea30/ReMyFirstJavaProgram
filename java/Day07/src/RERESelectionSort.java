/**
 * ClassName:RERESelectionSort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 8/8/20232:27 pm
 * @Version 1.0
 */
public class RERESelectionSort {
    public static void main(String[] args) {
        //选择排序(最小值开始）
        int[] arr = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        for (int i = 1; i < arr.length; i++) {
            int minIndex = i;
            int current = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            arr[i] = arr[minIndex];
            arr[minIndex] =current;
            System.out.print(arr[i]+", ");
        }


    }
}
