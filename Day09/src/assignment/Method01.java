package assignment;

/**
 * ClassName:Method01
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 10/8/20237:00 pm
 * @Version 1.0
 */
public class Method01 {
    public static void main(String[] args) {
        System.out.println(isEvenAndDivisibleByThree(6));

        System.out.println(isPositiveAndGreaterThanTen(10.1));

        System.out.println(isInValidRange(99));
    }

    public static boolean isEvenAndDivisibleByThree(int number) {
        //// 编写一个方法 isEvenAndDivisibleByThree(int number)，该方法接收一个
        //整数参数 number，判断该数是否既是偶数又能被3整除。如果是，则返回 true，否则
        //返回 false。
        boolean flag = false;
        if (number % 2 == 0 && number % 3 == 0) {
            flag = true;
        }
        return flag;
    }

    public static boolean isPositiveAndGreaterThanTen(double number) {
        // 编写一个方法 isPositiveAndGreaterThanTen(double number)，该方法接
        //收一个双精度浮点数参数 number，判断该数是否是正数且大于 10。如果满足条件，则
        //返回 true，否则返回 false。
        boolean flag = false;
        if (number > 10) {
            flag = true;
        }
        return flag;
    }

    public static boolean isInValidRange(int number) {
        // 编写一个方法 isInValidRange(int number)，该方法接收一个整数参数
        //number，判断该数是否在有效范围内。有效范围定义为大于等于 0 且小于等于 100。
        //如果在有效范围内，则返回 true，否则返回 false。
        boolean flag = false;
        if (number >= 0 && number <= 100) {
            flag = true;
        }
        return flag;
    }

    public static boolean isBothConditionsTrue(boolean condition1, boolean condition2) {
        //编写一个方法 isBothConditionsTrue(boolean condition1，boolean
        //condition2)，该方法接收两个布尔类型的参数 condition1 和 condition2，判断
        //这两个条件是否都为 true。如果两个条件都为 true，则返回 true，否则返回false
        return (condition1 == true && condition2 == true) ? true : false;
    }

    public static boolean isPalindrome(int number) {
//    编写一个方法 isPalindromeNumber(int number)，该方法接收一个四位整数参
//    数 number，判断该数是否是回文数。回文数是指正序和倒序读都相同的整数。如果是回
//    文数，则返回 true，否则返回false。
        int i = number;
        return i % 10 == i / 1000 && i / 100 % 10 == i / 10 % 10 ? true : false;
    }


}
