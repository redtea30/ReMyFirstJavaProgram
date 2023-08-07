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
        //2. 创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包
        //含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
        int[] array = new int[6];

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 101));
            sum += array[i];

        }
        System.out.println(sum);


    }
}
