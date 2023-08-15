/**
 * ClassName:BinarySearch
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 14/8/20232:00 pm
 * @Version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-9, -1, 2, 3, 3, 4, 10};
        int key = 4;

        System.out.println(binarySearch(nums,key));
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] > key) left = mid + 1;
            else if (arr[mid] < key) right = mid - 1;
            else if (key == arr[mid]) {
                return mid;
            }
        }
        return -1;

    }
}
