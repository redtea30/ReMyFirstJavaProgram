import java.util.Arrays;

/**
 * ClassName:InsertValue
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 12/8/20235:57 pm
 * @Version 1.0
 */
public class InsertValue {
    public static void main(String[] args) {
        //25。给定一个数组，请根据输入在数组的指定位置插入指定的值。
        int[] arr = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int[] newArr = new int[arr.length + 1];

        int value = 4;
        int index = 3;
        System.arraycopy(arr, 0, newArr, 0, index);//是araycopy，写的太急晕了
        newArr[index] = value;
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
        System.out.println(Arrays.toString(newArr));

    }
}
