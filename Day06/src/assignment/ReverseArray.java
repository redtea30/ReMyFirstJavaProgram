package assignment;

/**
 * ClassName:ReverseArray
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20238:07 pm
 * @Version 1.0
 */
public class ReverseArray {
    public static void main(String[] args) {
        //10. 现有一个int 数组，数组中有十个元素。将数组反转后输出。
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
            System.out.print(i + ", ");//打印数组
        }
        System.out.println();

        for (int i = 0, j = 9; i < j; i++, j--) {//reverse
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }

    }
}
