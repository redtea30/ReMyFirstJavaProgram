package practical;

import java.util.Arrays;

/**
 * ClassName:BinarySearch
 * Package: practical
 * Description:
 *
 * @Author Neko
 * @Create 22/8/20239:15 am
 * @Version 1.0
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 7, 6, 5, 4, 3, 2};
        BinarySearch bs = new BinarySearch();
        bs.sort(arr);
        System.out.println(Arrays.toString(arr));
        bs.binarySearch(arr);

    }

    private void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private void binarySearch(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int key = 3;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (left < right && arr[mid] < key) left = mid + 1;
            else if (left < right && arr[mid] > key) right = mid - 1;
            else if (key == arr[mid]) {
                System.out.println(mid);
                break;
            }
        }
        if (!(left < right)) {
            System.out.println(-1);
        }

    }

}
