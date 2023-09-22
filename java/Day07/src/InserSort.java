/**
 * ClassName:InserSort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 8/8/20233:14 pm
 * @Version 1.0
 */
public class InserSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && current < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (j != i) {
                arr[j] = current;
            }

        }


        for (int q : arr) {
            System.out.print(q + ", ");
        }
    }
}

