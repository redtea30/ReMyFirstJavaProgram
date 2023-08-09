import java.util.Arrays;

/**
 * ClassName:BinarySearch
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 9/8/20233:24 pm
 * @Version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{72, 23, 64, 64, 64, 35, 86, 35, 44, 64, 60, 79, 43, 64, 34, 1, 64, 64, 64, 34, 64, 64};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));//[1, 23, 34, 34, 35, 35, 43, 44, 60, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 72, 79, 86]


/*        int target = 64;
        int left = 0;
        int end = arr.length - 1;
        int index = 0;
        while (left <= end) {
            int mid = (left + end) >> 1;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {//这里都是在和target作比较
                left = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(index);*/

        int target = -100;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        if (start > end) {
            System.out.println("数字超过界限");
        }
        System.out.println(end);
        //当n=-100时，end==-1此时start=0，end<start
        System.out.println(start);
        //检测当n=100时，start==22,此时start大于end=21

    }
}
