package assignment;

import java.util.Scanner;

/**
 * ClassName:Login
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 10/8/20238:38 pm
 * @Version 1.0
 */
public class Login {
    public static void main(String[] args) {
//1编写一个Java程序，使用循环实现一个简单的登陆验证系统。系统预先设置一个用户名和密码，用户最多有3次输入机会。如果输入的用户名和密码与预设值匹配，则输出“登陆成功”，否则提示剩余尝试次数
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码");
            int pass = scanner.nextInt();
            if (login(pass)) {
                System.out.println("密码正确");
            } else {
                System.out.println("剩余尝试次数" + (2 - i));
            }
        }

    }

    public static boolean login(int d) {
        int password = 123456;
        return d == password;
    }
}
