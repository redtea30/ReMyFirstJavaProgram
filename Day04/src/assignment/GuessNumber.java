package assignment;

import java.util.Scanner;

/**
 * ClassName:GuessNumber
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20235:00 pm
 * @Version 1.0
 */
public class GuessNumber {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);


        boolean flag = false;
        while (true) {
            System.out.println("输入一个数字");
            int guess = scanner.nextInt();
            if (guess < answer) {
                System.out.println("小了");
            } else if (guess > answer) {
                System.out.println("大了");
            } else {
                System.out.println("对了");
                break;
            }

        }


    }
}
