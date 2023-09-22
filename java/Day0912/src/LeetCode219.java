import java.util.HashSet;
import java.util.Set;

public class LeetCode219 {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));


    }

    /**
     * Set.add方法是返回值为boolean，可以利用
     *
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set set = new HashSet();
        int i = 0;
        while (i < nums.length) {
            if (!(set.add(nums[i]))) {
                return true;
            }
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }

            i++;
        }
        return false;

    }
}
