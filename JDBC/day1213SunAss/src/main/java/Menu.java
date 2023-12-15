/*
import java.sql.SQLException;

*/
/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 13-12-2023  18:43
 * Describe：
 *//*


public class Menu {


    // 写一个菜单通过 QueryRunnerMyDB 实现登陆操作，进行数据的增删改查，在终端中完成
    public static void main(String[] args) throws SQLException {
        menu();
    }


    // 这个是登陆菜单，一开始进这里
    public static void menu() {
        while (true) {
            System.out.println("1. 登陆");
            System.out.println("2. 退出");
            switch (ScannerUtil.inputInt("请选择：")) {
                case 1:
                    System.out.println("登陆成功");
                    break;
                case 2:
                    System.out.println("退出成功");
                    System.exit(0);
                    break;
                }
        }
    }

    // 这个实现登录操作
    public static void login() {
        while (true) {
            System.out.println("请输入用户名：");
            String name = ScannerUtil.inputStr();
            System.out.println("请输入密码：");
            String password = ScannerUtil.inputStr();
            if (name.equals("admin") && password.equals("123456")) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("用户名或密码错误");
            }
        }
    }
    // 登陆后的菜单
    public static void menuAfterLogin() {
        while (true) {
            System.out.println("1. 退出");
            System.out.println("2. 增");
            System.out.println("3. 删");
            System.out.println("4. 改");
            System.out.println("5. 查");
            switch (ScannerUtil.inputInt("请选择：")) {
                case 1:
                    System.out.println("退出成功");
                    break;
                }
            }
    }

    public static void update() {
        while (true) {
            switch (ScannerUtil.inputInt("请选择：")) {
                case 1:
                    System.out.println("退出成功");
                    break;
                }

        }
    }

    // 这个实现登陆后的删除操作，只能自己的数据
    public static void delete() {
        while (true) {

        }
    }




}
*/
