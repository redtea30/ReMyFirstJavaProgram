package assignment.cinema;

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
    static Scanner sc = new Scanner(System.in);
    static MovieTheater mt = new MovieTheater();

    public static void main(String[] args) {

        while (true) {
            System.out.println("开发喵影院");
            menu1();
            int input = sc.nextInt();
            switch (input) {
                case 1 -> {//搜索电影
                    System.out.println("请输入你要查找的电影名称");
                    String inputStr = sc.next();
                    System.out.println(mt.searchMovie(inputStr).toString());
                }
                case 2 -> //展示所有电影
                {
                    mt.showAllMovie();
                }
                case 3 -> {//管理员登陆
                    if (mt.isAdmin()) {
                        boolean menuSecond = true;
                        while (menuSecond) {
                            menuAdmin();
                            int adminStr = sc.nextInt();
                            switch (adminStr) {
                                case 1 -> {//增加电影
                                    boolean isTrue = mt.addMovie();
                                    System.out.println(isTrue ? "创建成功" : "创建失败");
                                }
                                case 2 ->//删除电影
                                {
                                    System.out.println(mt.deleteMovie() ? "删除成功" : "删除失败");
                                }
                                case 3 ->//修改电影（输入电影名称，展示电影信息，选择要修改的内容（价格/上映时间），输入内容，修改已存储的电影信息）
                                {
                                    System.out.println("请输入想要修改的电影名");
                                    String changeMovie = sc.next();
                                    int changeMovieIndex = mt.intSearchMovie(changeMovie);
                                    if (changeMovieIndex == -1) {
                                        System.out.println("未找到");
                                    } else {
                                        //修改电影列表
                                        System.out.print("请输入新的电影名称:");
                                        String name1 = sc.next();
                                        System.out.print("请输入新的电影价格:");
                                        double price1 = sc.nextDouble();
                                        System.out.print("请输入新的导演名:");
                                        String director1 = sc.next();
                                        System.out.print("请输入新的上映年份:");
                                        int date1 = sc.nextInt();
                                        mt.changeMovie(changeMovieIndex, name1, price1, director1, date1);
                                    }


                                }
                                case 4 ->//查看所有用户信息
                                {
                                    mt.showAllUser();
                                }

                                case 5 -> {//退出
                                    menuSecond = false;
                                }
                                default -> System.out.println("输入错误");
                            }

                        }
                    }
                }
                case 4 ->//用户登录
                {
                }
                case 5 ->//用户注册
                {
                    if(mt.addUser()){
                        System.out.println("创建成功");
                    }else {
                        System.out.println("创建失败");
                    }

                }
                case 6 ->//退出
                {
                    System.out.println("退出系统中");
                    return;
                }
                default -> System.out.println("输入错误");
            }
        }

    }


    /**
     * 主菜单
     */
    public static void menu1() {
        System.out.println("========= 电影信息系统 =========");
        System.out.println("1. 查询电影信息");
        System.out.println("2. 显示所有电影信息(按上映日期降序)");
        System.out.println("3. 管理员登录");
        System.out.println("4. 用户登录");
        System.out.println("5. 用户注册");
        System.out.println("6. 退出系统");
        System.out.println("请选择:");
        separateLine();
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
