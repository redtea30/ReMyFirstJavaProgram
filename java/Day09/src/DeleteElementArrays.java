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
public class DeleteElementArrays {
    public static void main(String[] args) {
        int[] nums = {2, 11, 33, 44, 55, 66, 277};

        int[] newNums = new int[nums.length - 1];
        int key = 33;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) index = i;
        }
        System.arraycopy(nums, 0, newNums, 0, index);
        System.arraycopy(nums, index+1, newNums, index,newNums.length - index);//取值范围


        System.out.println(Arrays.toString(newNums));
    }
}
