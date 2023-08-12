/**
 * ClassName:TwentyFour
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 12/8/20235:36 pm
 * @Version 1.0
 */
public class TwentyFour {
    public static void main(String[] args) {
        //# 24。从键盘输入一个数字，设计一个方法通过二分查找返回其位置 (不存在返回 -1)
        int[] arr = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};//binarySearch只适用于已经拍好顺序的数组（升序）
        int key = 15;
        System.out.println(binarySearch(arr, key));
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) >> 1;
            if (arr[mid] > key) {//这里的是arr[mid]，而不是mid，比较的是数组里变量的值
                right = mid - 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else if (key == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
