package genshinImpactStart;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName:RoleManage
 * Package: genshinImpactStart
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20233:13 pm
 * @Version 1.0
 */
public class RoleManage {
    private static ArrayList roList = new ArrayList();
    private static Scanner sc = new Scanner(System.in);

    //这么搞我觉得OK , 反正只有一个对象
    static {
        Role rol = new Role("魍", '风', 5, 1, 90);
        Role rol1 = new Role("枫原万叶", '风', 5, 0, 90);
        Role rol2 = new Role("胡桃", '火', 5, 1, 89);
        Role rol3 = new Role("夜兰", '水', 5, 0, 89);
        Role rol4 = new Role("雷电将军", '雷', 5, 0, 89);
        Role rol5 = new Role("纳西妲", '草', 5, 1, 89);
        Role rol6 = new Role("神里绫华", '冰', 5, 0, 90);
        Role rol7 = new Role("行秋", '水', 4, 6, 89);
        roList.add(rol);
        roList.add(rol1);
        roList.add(rol2);
        roList.add(rol3);
        roList.add(rol4);
        roList.add(rol5);
        roList.add(rol6);
        roList.add(rol7);


    }

    public static void main(String[] args) {
        System.out.println("展示所有脚色");
        showAllCharacter();


    }

    /**
     * 展示所有角色
     */
    static void showAllCharacter() {
        roList.forEach((o) -> {
            System.out.println(o.toString());
        });

    }

    static boolean addCharacter() {
        boolean loop = true;
        boolean errorType = false;
        do {
            if (errorType) {
                System.out.println("请重新输入");
            }
            System.out.println("请输入角色的姓名");
            String name = sc.next();
            System.out.println("请输入角色的命座，输入数字0-6 （就是几命，最多六大概）");
            int star = sc.nextInt();
            if (!(star >= 0 && star <= 6)) {
                System.out.println("命座最少0个，最多6个");
                errorType = true;
                continue;
            }
            System.out.println("请输入角色的等级,只要不为负就OK");
            int level = sc.nextInt();
            if (level < 0) {
                System.out.println("等级输入错误");
                continue;
            }
            System.out.println("请输入角色的稀有度");
            int rarity = sc.nextInt();
            if (level < 0) {
                System.out.println("等级输入错误");
                continue;
            }
            System.out.println("请输入角色的属性");
            char attr = sc.next().charAt(0);
        } while (loop);
        return true;
    }

    static void menu() {
        System.out.println(
                """
                        1. 展示所有角色
                        2. 添加角色
                        3. 按照等级排序
                        4. 按照命座排序
                        5. 删除不满90级的所有角色
                        0. 退出系统
                                            """
        );
    }

    static void startGenshinManager() {
        menu();
        int input = sc.nextInt();
        switch (input) {
            case 0 -> System.exit(1);
            case 1 -> {
                return;
            }
            case 2 -> {
                return;
            }
            case 3 -> {
                sortByLevel(roList);
            }
            case 4 -> {
                return;
            }
            case 5 -> {
                return;
            }
            default -> {
                System.out.println("输入错误");
                startGenshinManager();
            }


        }
    }

    static void sortByLevel(ArrayList list) {


    }


}