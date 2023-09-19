package assignment0919;

/**
 * ClassName:CanDividedBy6
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20235:08 pm
 * @Version 1.0
 */
public class CanDividedBy6 {
    public static void main(String[] args) {
        //5.有一个数组int[] arr = {9,1,3,4,54,56,23,22,20,43,45,78};,要求打印数组中能被6整除的元素。
        int[] arr = {9, 1, 3, 4, 54, 56, 23, 22, 20, 43, 45, 78};
        for (int i = 0; i < arr.length; i++) {
            if (6 % arr[i] == 0) {
                System.out.println(arr[i]);
            }
        }

    }
}
