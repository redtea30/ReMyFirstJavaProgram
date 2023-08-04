package extension;

import java.util.Scanner;

/**
 * ClassName:Login
 * Package: extension
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20234:22 pm
 * @Version 1.0
 */
public class Login {
    public static void main(String[] args) {
        //编写一个Java程序，使用循环实现一个简单的登陆验证系
        //统。系统预先设置一个用户名和密码，用户最多有3次输
        //入机会。如果输入的用户名和密码与预设值匹配，则输出
        //“登陆成功”，否则提示剩余尝试次数。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入，一共三次机会");

        String password = "password";
        for (int i = 0; i < 3; i++) {
            String input = scanner.next();
            if (password.equals(input)) {//String 类型不能使用==进行检测
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("输入错误，还剩下" + (3 - 1 - i) + "次机会");
            }

        }

        scanner.close();
    }
}
