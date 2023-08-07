package assignment;

/**
 * ClassName:MakeANumber
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20235:29 pm
 * @Version 1.0
 */
public class MakeANumber {
    public static void main(String[] args) {
        //7. 现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位
        //置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。请编写
        //程序计算，这个数组所表示的整数值。例如：

        int[] arr = {2, 1, 3, 5, 4};
        int num = 0;
        for (int i = 4; i >= 0; i--) {
            if (i == 4) {
                num += arr[i];
            } else {
                //num += arr[i] * Math.pow(10, (4 - i));//太过于容易，有空改成别的样式
                if (i == 4) {
                    num += arr[i];
                } else if (i == 3) {
                    num += arr[i] * 10;
                } else if (i == 2) {
                    num += arr[i] * 10 * 10;
                } else if (i == 1) {
                    num += arr[i] * 10 * 10 * 10;
                } else {
                    num += arr[i] * 10 * 10 * 10 * 10;
                }


            }
        }

        System.out.println(num);
    }
}
