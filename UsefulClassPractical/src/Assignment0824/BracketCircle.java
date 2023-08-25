package Assignment0824;

/**
 * ClassName:BracketCircle
 * Package: Assignment0824
 * Description:
 *
 * @Author Neko
 * @Create 24/8/20238:00 pm
 * @Version 1.0
 */
public class BracketCircle {
    public static void main(String[] args) {
        String brackets = "(  (((    )))  )";

        System.out.println(bracketTest(brackets));


    }

    /**
     * 类快速排序？
     *
     * @param brackets
     * @return
     */
    public static boolean bracketTest(String brackets) {
        int left = 0;
        int right = brackets.length() - 1;
        while (left < right) {
            while (left < right && is41(brackets, right)) {
                right--;
                if ((left < right) && (brackets.charAt(right) == '(')) return false;
            }
            while (left < right && is40(brackets, left)) {
                left++;
                if ((left < right) && (brackets.charAt(left) == ')')) return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean is41(String str, int rightIndex) {
        return !(str.charAt(rightIndex) == ')');
    }

    public static boolean is40(String str, int leftIndex) {
        return !(str.charAt(leftIndex) == '(');
    }
}
