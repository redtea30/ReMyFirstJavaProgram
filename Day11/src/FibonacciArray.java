/**
 * ClassName:FebnoacciArray
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 14/8/20238:24 am
 * @Version 1.0
 */
public class FibonacciArray {

    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {
            System.out.print(fibonacciGenerator(i, 1, 1) + "\t");
            //System.out.print(fibonacciGenerator(i) + "\t");
        }
        System.out.println(factorial(5));
    }


    public static int factorial(int a) {
        if (a == 1) return 1;
        else return a * factorial(a - 1);
    }

    public static int fibonacciGenerator(int size, int start, int total) {
        //尾递归？
        if (size <= 2) return total;
        else return fibonacciGenerator(size - 1, total, start + total);
    }

    public static int fibonacciGenerator(int size) {
        //普通递归
        if (size == 1 || size == 2) return 1;
        else return fibonacciGenerator(size - 1) + fibonacciGenerator(size - 2);
    }
}

