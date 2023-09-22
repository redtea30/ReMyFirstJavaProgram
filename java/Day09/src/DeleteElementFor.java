import java.util.Arrays;

/**
 * ClassName:DeleteElementFor
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 10/8/20231:59 pm
 * @Version 1.0
 */
public class DeleteElementFor {
    public static void main(String[] args) {
        int[] nums = {2, 11, 33, 44, 55, 66, 277};
        int[] newNums = new int[nums.length - 1];

        int key = 33;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                index = i;//找到33的下标
            }
        }

        for (int i = 0; i < newNums.length; i++) {
            if (i < index) {
                newNums[i] = nums[i];
            } else if (i >= index) {//注意数组的取值范围，newNums[i]的时候不是跳过
                newNums[i] = nums[i + 1];
            }
        }

        System.out.println(Arrays.toString(newNums));
    }
}
