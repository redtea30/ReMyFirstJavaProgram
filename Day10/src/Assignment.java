import java.util.Arrays;

/**
 * ClassName:Assignment
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 11/8/20237:29 pm
 * @Version 1.0
 */
public class Assignment {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sumInterger(1, 2);
        System.out.println(fibonacci(5));
        System.out.println(Arrays.toString(fibonacciGenerator(20)));//20位斐波那契数列
        System.out.println(factorial(20));
        System.out.println(isPrimeNum(5));
        System.out.println(isPrimeNum(6));
        reverseArray(arr);

        isPalindromicNum(111222222111L);


        reverseArray(arr, 1, 7);
        elementToLeft(arr, 5);


        //实验品，数字转数组
/*        int a = 1221;
        String ac = String.valueOf(a);
        char[] arr2 = ac.toCharArray();
        System.out.println(Arrays.toString(arr2));*/

    }

    public static void sumInterger(int a, int b) {
        //设计一个方法，用于计算整数的和
        System.out.println(a + b);
    }

    public static long fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static long[] fibonacciGenerator(int i) {
        long[] arr = new long[i];
        for (int j = 0; j < i; j++) {
            arr[j] = fibonacci(j + 1);
        }
        return arr;
    }

    public static long factorial(long a) {
        //编写一个方法，接受一个正整数作为参数，并返回它的阶乘
        if (a == 1 || a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    public static String isPrimeNum(int a) {
        //编写一个方法，接受一个整数作为参数，并判断它是否为素数（质数）
        for (int i = (int) Math.sqrt(a); i > 1; i--) {
            if (a % i == 0) {
                return "false";
            }
        }
        return "true";
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //编写一个方法，接受一个字符数组，将其翻转并输出。
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void isPalindromicNum(long a) {
        //编写一个方法，接受一个整数作为参数，判断它是否为回文数（正着读和倒着读都一样）
        String str = String.valueOf(a);
        char[] arr = str.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }

    public static void reverseArray(int[] arr, int a, int b) {
        //编写一个方法，接受一个整数数组和两个索引作为参数，交换数组中指定索引位置的两个元素。
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void elementToLeft(int[] arr, int k) {
        //编写一个方法，接受一个整数数组和一个正整数 k 作为参数，将数组中的元素左移 k 个位置。
        int[] arr1 = new int[arr.length];

        System.arraycopy(arr, k, arr1, 0, arr.length - k);//旧数组的右边塞到新数组的左边
        System.arraycopy(arr, 0, arr1, arr.length - k, k);
        System.out.println(Arrays.toString(arr1));
    }
    public static void isPalindromicNum1(Long i){



    }

}
