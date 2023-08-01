package FunctionTest;

/**
 * ClassName:recursion
 * Package: FunctionTest
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20238:17 pm
 * @Version 1.0
 */
public class recursion {
    public static int factorial(int n) {
        //演示，对于5进行递归
        if (n == 0 || n == 1) {//递归结束
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);//120
    }

}
