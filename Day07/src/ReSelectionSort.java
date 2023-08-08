/**
 * ClassName:ReSelectionSort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 8/8/202311:48 am
 * @Version 1.0
 */
public class ReSelectionSort {
    public static void main(String[] args) {
        //选择排序
        int[] arr = new int[]{9, 1, 3, 4, 54, 56, 23, 22, 20, 43};
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            arr[i] = arr[minIndex];
            arr[minIndex] = current;
            System.out.print(i+", ");
        }

    }
}
