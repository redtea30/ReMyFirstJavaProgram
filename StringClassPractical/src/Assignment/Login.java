package Assignment;

import java.util.Objects;
import java.util.Scanner;

/**
 * ClassName:Login
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 23/8/20237:09 pm
 * @Version 1.0
 */
public class Login {
    public static void main(String[] args) {
        counter();

    }

    /**
     * 扮演计数器功能的一个类
     */
    static void counter() {
        for (int i = 3; i > 0; i--) {
            System.out.println("当前有" + i + "次机会");
            if (login()) {
                System.out.println("欢迎进入系统！");
            }
        }
    }

    /**
     * 单纯的判断方法
     *
     * @return Boolean
     */
    static boolean login() {
        Scanner scanner = new Scanner(System.in);
        String username = "kfm";
        String password = "123456";
        System.out.println("请输入用户名");
        String inputUsername = scanner.next();
        System.out.println("请输入密码");
        String inputPassword = scanner.next();
        //本来该用equals但是==也没问题，地址值一样？
        return Objects.equals(inputUsername, username) && Objects.equals(inputPassword, password);
    }


}
