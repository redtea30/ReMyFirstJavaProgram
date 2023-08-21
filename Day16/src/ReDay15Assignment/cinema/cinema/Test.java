package ReDay15Assignment.cinema.cinema;

import java.util.Scanner;

/**
 * ClassName:Test
 * Package: assignment.cinema
 * Description:
 *
 * @Author Neko
 * @Create 20/8/20235:56 pm
 * @Version 1.0
 */
public class Test {
    private static Scanner sc = new Scanner(System.in);
    static MovieTheater mt = new MovieTheater();

    /**
     * 补丁，phone值类型为long，拿到long的长度
     *
     * @param phone
     * @return
     */
    public int getPhoneLength(long phone) {
        int phoneLength = 0;
        while (true) {
            phoneLength++;
            phone /= 10;
            if (phone == 0) break;
        }
        return phoneLength;
    }

    public static void main(String[] args) {
        //现在main方法就是一个启动器了 LOL
        mainMenu();
    }


    /**
     * 主菜单
     */
    public static void mainMenu() {
        System.out.println("===========开发喵影院===========");
        System.out.println("********* 电影信息系统 *********");
        System.out.println("1. 查询电影信息");
        System.out.println("2. 显示所有电影信息(按上映日期降序)");
        System.out.println("3. 管理员登录");
        System.out.println("4. 用户登录");
        System.out.println("5. 用户注册");
        System.out.println("6. 退出系统");
        System.out.println("请选择:");
        separateLine();
        int userInput = sc.nextInt();
        switch (userInput) {
            case 1 -> mt.searchMovie();
            case 2 -> mt.showAllMovie();
        }


    }


    public static void menuUserInfoManagement() {
        System.out.println("======== 用户管理菜单 ========");
        System.out.println("1. 修改用户信息");
        System.out.println("2. 查询用户信息");
        System.out.println("3. 返回上级菜单");
        separateLine();
    }

    public static void menuAdmin() {
        System.out.println("======== 管理员管理菜单 ========");
        System.out.println("1. 新增电影");
        System.out.println("2. 删除电影");
        System.out.println("3. 修改电影信息");
        System.out.println("4. 查看所有用户信息");
        System.out.println("5. 退出");
        separateLine();
    }

    public static void separateLine() {
        System.out.println("==============================");
    }

}
