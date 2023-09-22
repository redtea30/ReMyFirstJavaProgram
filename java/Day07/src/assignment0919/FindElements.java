package assignment0919;

import java.util.Scanner;

/**
 * ClassName:FindElements
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 8/8/20237:47 pm
 * @Version 1.0
 */
public class FindElements {
    public static void main(String[] args) {
//给定一个整数数组，输入一个值 n ，输出 n 在数组中的下标(如果不存在输出 -1 )
//int[] arr = {3, 2, 1, 4, 5};
//例如:
//1. 输入： 3
//输出： 0
//2. 输入： 6
//输出： -1
        int i = 0;
        int[] arr = {3, 2, 1, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个值");
        int num = scanner.nextInt();
        boolean flag = true;
        for (i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println(i);
                flag = false;
            }
        }
        if (flag){
            System.out.println(-1);
        }
    }
}
