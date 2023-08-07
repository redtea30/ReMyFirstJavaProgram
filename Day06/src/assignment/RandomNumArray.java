package assignment;

/**
 * ClassName:RandomNumArray
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20234:23 pm
 * @Version 1.0
 */
public class RandomNumArray {
    public static void main(String[] args) {
        int[] array = new int[6];

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * -100));
            sum += array[i];

        }
        System.out.println(sum);


    }
}
