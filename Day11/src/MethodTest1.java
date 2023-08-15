/**
 * ClassName:MethodTest1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 13/8/20239:24 pm
 * @Version 1.0
 */
public class MethodTest1 {
    public static void main(String[] args) {
        System.out.println(addAll(10));//55
        isOdd(10);//Even Number
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));//55
    }
    public static int sum(int... nums) {
        //可变长度参数
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    public static void isOdd(int num) {
        if (num % 2 != 0) {
            System.out.println("Odd Number");
        }
        System.out.println("Even Number");
    }


    public static int addAll(int num) {
        //分析：
        //需要求1~n的和，由于n不确定是多少，所以就把n写成形式参数，n的具体值由调用者指定。
        //在方法中把n当做一个确定的数据来使用就行。
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }



}
