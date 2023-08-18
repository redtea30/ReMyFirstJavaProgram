import java.util.Arrays;
import java.util.Objects;

/**
 * ClassName:MethodTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 18/8/20239:03 am
 * @Version 1.0
 */
public class MethodTest {

    public static void sumPrimeNum(int num) {
        int sum = 2;
        for (int i = 2; i < num + 1; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (i % j != 0 && j == i - 1) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);
    }


    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int prev = i - 1;
            int current = arr[i];
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    public static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        int targetIndex;
        int mid;

        while (left < right) {
            mid = (left + right) >> 1;
            if (arr[mid] > num) {
                right = mid - 1;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else if (arr[mid] == num) {
                targetIndex = mid;
                return targetIndex;
            }
        }
        return -1;
    }

    public static void quickSort(int arr, int start, int end) {
        if (start >= end) {
            return;
        }
    }

    public static void main(String[] args) {
        //1~n的质数和
        int num = 100;
        sumPrimeNum(100);//1060

        //insertSort
        int[] arr = {1, 4, 5, 9, 8, 7, 6, 5, 3, 2};
        int[] arr1 = arr;
        insertSort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 5, 6, 7, 8, 9]

        //binarySearch
        System.out.println(binarySearch(arr, 2));//1

        //quickSort
        /*quickSort(arr1);*/


        System.out.println(Objects.toString(arr));
        System.out.println(String.valueOf(arr));
        System.out.println(String.valueOf(arr[1]));
        toString(arr);
    }

    public static void toString(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " * ");
            }
        }
        System.out.println(" ]");


    }

}
