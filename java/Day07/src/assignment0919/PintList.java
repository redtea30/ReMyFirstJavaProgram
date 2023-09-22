package assignment0919;

import java.util.Random;

/**
 * ClassName:PintList
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 8/8/20237:02 pm
 * @Version 1.0
 */
public class PintList {
    public static void main(String[] args) {
        //一个班级有若干学生，每个学生的成绩以整数表示。请实现一个程序，根据学生的成绩对
        //他们进行排名并输出。
        //排名 成绩
        //1 xxx
        //2 xxx
        //3 xxx
        int length = 10;

        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(101);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        for (int i = arr.length - 2; i >= 0; i--) {
            int current = arr[i];
            int prevIndex = i + 1;
            while (prevIndex < arr.length && arr[prevIndex] > current) {
                arr[prevIndex - 1] = arr[prevIndex];
                prevIndex++;
            }
            arr[prevIndex - 1] = current;

        }

        System.out.println("成绩\t" + "排名" + "\s");
        for (int p = 0; p < arr.length; p++) {
            System.out.println(arr[p] + "\t" + (p + 1));
        }

    }
}