package practical;

import java.util.Arrays;

/**
 * ClassName:MethodsTest
 * Package: practical
 * Description:
 *
 * @Author Neko
 * @Create 11/8/202312:25 pm
 * @Version 1.0
 */
public class MethodsTest {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 7, 3, 2, 1};
        int target = 3;
        binarySearch(arr, target);
        //System.out.println(Arrays.toString(insertSort(arr)));
        //insertSort2(arr);//[1, 2, 3, 6, 7]
        //bubbleSort1(arr);
        //selectSort(arr);
        //System.out.println(Arrays.toString(bubbleSort3(arr)));
        bubbleSort4(arr);
    }

    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) >> 1;

            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                System.out.println(mid + 1);
                break;
            }
        }
        if (left > right) {
            System.out.println("数字不在列表中");
        }
    }

    public static int[] insertSort(int[] arr) {
        //正排
        for (int i = 1; i < arr.length; i++) {
            int prevIndex = i - 1;
            int current = arr[i];
            while (prevIndex >= 0 && current < arr[prevIndex]) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = current;
        }
        return arr;
    }

    public static int[] inertSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int prevIndex = i - 1;
            int current = arr[i];
            while (prevIndex >= 0 && arr[prevIndex] > current) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = current;
        }

        return arr;
    }

    public static void insertSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int prevIndex = i - 1;
            int current = arr[i];
            while (prevIndex >= 0 && arr[prevIndex] > current) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort3(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void bubbleSort4(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


