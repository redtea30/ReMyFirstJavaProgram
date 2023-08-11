package practical;

/**
 * ClassName:BinarySearch
 * Package: practical
 * Description:
 *
 * @Author Neko
 * @Create 11/8/202312:25 pm
 * @Version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 7, 3, 2, 1};
        int target = 5;
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
        if(left>right){
            System.out.println("数字不在列表中");
        }

    }
}
