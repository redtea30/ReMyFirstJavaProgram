import java.util.Random;

/**
 * ClassName:MethodTest1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 10/8/20236:39 pm
 * @Version 1.0
 */
public class MethodTest1 {
    public static void main(String[] args) {
        test1();
        count1(999, 1);
    }


    public static void test1() {
        System.out.println("HELLO WORLD!");
    }


    public static void count1(int i, int j) {
        System.out.println(i + j);
    }

    public static void bubbleSort(int[] a) {

    }

    public static void generatorArray() {
        Random random = new Random();
        int[] a = new int[10];


    }

}
