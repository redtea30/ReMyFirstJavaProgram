package ReDay15Assignment.cinema.kaifamiao_cinema;

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
    private static final Scanner sc = new Scanner(System.in);//全局调用
    public static User logged;
    static MovieTheater mt = new MovieTheater();


    public static void main(String[] args) {
        //现在main方法就是一个启动器了 LOL
        mainMenu();
    }


    /**
     * 主菜单
     */
    public static void mainMenu() {
        while (true) {
            System.out.println("===========开发喵影院===========");
            System.out.println("          电影信息系统          ");
            System.out.println("1. 查询电影信息");
            System.out.println("2. 显示所有电影信息(按上映日期降序)");
            System.out.println("3. 管理员登录");
            System.out.println("4. 用户登录");
            System.out.println("5. 用户注册");
            System.out.println("0. 退出系统");
            System.out.println("请选择:");
            separateLine();
            int userInput = sc.nextInt();
            switch (userInput) {
                case 0 -> {
                    return;//OK的
                }
                case 1 -> mt.searchMovie();
                case 2 -> mt.showAllMovie();
                case 3 -> {
                    User admin = mt.login(1);
                    //这又是个补丁
                    if (admin != null && admin.getRole() == 1) menuAdmin();
                }
                case 4 -> {
                    menuUserInfoManagement();
                }
                case 5 -> mt.addUser();

                default -> System.out.println("输入错误");
            }
        }

    }


    /**
     * 用户信息管理界面
     * 权限属于用户
     */
    public static void menuUserInfoManagement() {
        logged = mt.login(2);
        boolean hasLogin = false;
        if (logged != null) hasLogin = true;
        System.out.println(hasLogin ? "登陆成功" : "登陆失败");
        while (hasLogin) {
            System.out.println("======== 用户管理菜单 ========");
            System.out.println("1. 修改用户信息");
            System.out.println("2. 查询用户信息");
            System.out.println("3. 购买电影票");
            System.out.println("4. 已购票查询");
            System.out.println("0. 返回上级菜单");
            separateLine();

            int userMenu = sc.nextInt();
            switch (userMenu) {
                case 0 -> mainMenu();
                case 1 -> mt.modifyUserInfo(logged);
                case 2 -> mt.showCurrentUserInfo(logged);
                case 3 -> mt.buyTicket();
                case 4 -> mt.showPurchasedTicket();
                default -> //输入错误
                        System.out.println();
            }
        }
    }

    /**
     * 购买电影票
     */


    /**
     * 管理员菜单
     */
    public static void menuAdmin() {
        while (true) {
            System.out.println("======== 管理员管理菜单 ========");
            System.out.println("1. 新增电影");
            System.out.println("2. 删除电影");
            System.out.println("3. 修改电影信息");
            System.out.println("4. 查看所有用户信息");
            System.out.println("0. 退出");
            separateLine();
            int userInput = sc.nextInt();

            switch (userInput) {
                case 0 -> mainMenu();
                case 1 -> mt.addMovie();
                case 2 -> mt.deleteMovie();
                case 3 -> mt.modifyMovieInfo();
                case 4 -> mt.showAllUser();
                default -> System.out.println("输入错误");
            }
        }
    }

    /**
     * 分割线=====
     */
    public static void separateLine() {
        System.out.println("==============================");
    }
}