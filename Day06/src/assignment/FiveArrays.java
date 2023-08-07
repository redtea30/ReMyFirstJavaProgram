package assignment;

import java.util.Scanner;

/**
 * ClassName:FiveArrays
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20234:42 pm
 * @Version 1.0
 */
public class FiveArrays {
    public static void main(String[] args) {
        //按要求在main方法中完成以下功能：
        //a. 定义一个长度为5的int型数组arr，提示用户输入5个1-60之间的数字作为数组元素
        //b. 生成2-10（范围包含2和10）之间的随机数num
        //c. 遍历数组arr,筛选出数组中不是num倍数的元素并输出
        //PS：输入的数组元素范围包括1和60，不需要代码判断
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {//a. 定义一个长度为5的int型数组arr，提示用户输入5个1-60之间的数字作为数组元素
            while (true) {
                if (i == 4 && (arr[4] != 0)) break;
                System.out.println("请输入第" + (i + 1) + "个元素的值,范围[1,60]");//我加上了代码判断LOL
                int input = scanner.nextInt();
                if (input >= 1 && input <= 60) {
                    arr[i] = input;
                    break;
                } else System.out.println("请再输入一次");
            }
        }
        int randomNum = (int) (Math.random() * 9 + 2);//b. 生成2-10（范围包含2和10）之间的随机数num
        System.out.println(randomNum);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % randomNum != 0)
                System.out.println("第" + (i + 1) + "元素" + arr[i] + "不是randomNum" + randomNum + "的倍数");//c. 遍历数组arr,筛选出数组中不是num倍数的元素并输出
        }


        scanner.close();
    }
}
