package FunctionTest;

/**
 * ClassName:variable_ength_argument
 * Package: FunctionTest
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20237:48 am
 * @Version 1.0
 */
public class variable_ength_argument {
    public static int sum(int... nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        int result1=sum(1,2,3);
        System.out.println(result1);

        int result2=sum(1,2,3,4,5);
        System.out.println(result2);

    }


}
