package assignment0919;

/**
 * ClassName:CountAppearanceTimes
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20235:14 pm
 * @Version 1.0
 */
public class CountAppearanceTimes {
    public static void main(String[] args) {
        //6.定义一个长度为20的数组，元素为20-40的随机数，要求判断指定元素在数组中出现
        //的次数，指定元素为键盘录入范围为20-40之间。

        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 21 + 20);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        int randomNum = (int) (Math.random() * 21 + 20);
        int appearanceTimes = 0;
        for (int i : arr) {
            if (randomNum == i) {
                appearanceTimes++;
            }
        }
        System.out.println("元素" + randomNum + "在数组中出现了" + appearanceTimes + "次");

    }
}
