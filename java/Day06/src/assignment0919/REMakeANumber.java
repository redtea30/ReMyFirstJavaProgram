package assignment0919;

/**
 * ClassName:MakeANumber
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20235:29 pm
 * @Version 1.0
 */
public class REMakeANumber {
    public static void main(String[] args) {
        //7. 现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位
        //置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。请编写
        //程序计算，这个数组所表示的整数值。例如：

        int[] arr = {4, 5, 2, 3, 2, 1, 3, 5, 4};
        int sum = 0;
        //改循环格式
        for (int i = 0; i < arr.length; i++) {
            int pow = 1;
            for (int j = 1; j < arr.length - i; j++) {//注意j的取值范围，范围应当为1~(array.length-i)
                pow *= 10;                            //i的取值范围为0-array.length-1
            }                                         //取值范围应当相同
            sum += (pow * arr[i]);
        }
        System.out.println(sum);
    }
}
