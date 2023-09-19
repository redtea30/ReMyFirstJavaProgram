package assignment0919;

import java.util.Scanner;

/**
 * ClassName:Constellation
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20237:15 pm
 * @Version 1.0
 */
public class Constellation {
    public static void main(String[] args) {
/*       编写一个程序，根据用户输入的月份和日期，输出该日期所在的星座。以下是一个简
        单的星座日期范围参考：
        水瓶座（1月20日到2月18日）
        双鱼座（2月19日到3月20日）
        白羊座（3月21日到4月19日）
        金牛座（4月20日到5月20日）
        双子座（5月21日到6月20日）
        巨蟹座（6月21日到7月22日）
        狮子座（7月23日到8月22日）
        处女座（8月23日到9月22日）
        天秤座（9月23日到10月22日）
        天蝎座（10月23日到11月21日）
        射手座（11月22日到12月21日）
        魔羯座（12月22日到1月19日）*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();

        System.out.println("请输入日期");
        int day = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("你输入的月份有误");
        } else {
            switch (month) {
                // 31 30 29 2831 1,3,5,7,8,10,12 30 4，6 ，9，11 2 年29天 平年 28天
                case 1 -> {
                    if (day >= 1 && day <= 19) {
                        System.out.println("魔蝎座");
                    } else if (day >= 20 && day <= 31) {
                        System.out.println("水瓶座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 2 -> {
                    if (day >= 1 && day <= 18) {
                        System.out.println("水瓶座");
                    } else if (day >= 19 && day <= 29) {
                        System.out.println("双鱼座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 3 -> {
                    if (day >= 1 && day <= 20) {
                        System.out.println("双鱼座");
                    } else if (day >= 21 && day <= 31) {
                        System.out.println("白羊座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 4 -> {
                    if (day >= 1 && day <= 19) {
                        System.out.println("白羊座");
                    } else if (day >= 20 && day <= 30) {
                        System.out.println("金牛座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 5 -> {
                    if (day >= 1 && day <= 20) {
                        System.out.println("金牛座");
                    } else if (day >= 21 && day <= 31) {
                        System.out.println("双子座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 6 -> {
                    if (day >= 1 && day <= 19) {
                        System.out.println("双子座");
                    } else if (day >= 20 && day <= 30) {
                        System.out.println("巨蟹座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 7 -> {
                    if (day >= 1 && day <= 21) {
                        System.out.println("巨蟹座");
                    } else if (day >= 22 && day <= 31) {
                        System.out.println("狮子座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 8 -> {
                    if (day >= 1 && day <= 22) {
                        System.out.println("狮子座");
                    } else if (day >= 23 && day <= 31) {
                        System.out.println("处女座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 9 -> {
                    if (day >= 1 && day <= 22) {
                        System.out.println("处女座");
                    } else if (day >= 23 && day <= 30) {
                        System.out.println("天秤座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 10 -> {
                    if (day >= 1 && day <= 22) {
                        System.out.println("天秤座");
                    } else if (day >= 23 && day <= 31) {
                        System.out.println("天蝎座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 11 -> {
                    if (day >= 1 && day <= 21) {
                        System.out.println("天蝎座");
                    } else if (day >= 22 && day <= 30) {
                        System.out.println("射手座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
                case 12 -> {
                    if (day >= 1 && day <= 21) {
                        System.out.println("射手座");
                    } else if (day >= 22 && day <= 31) {
                        System.out.println("魔羯座");
                    } else {
                        System.out.println("你输入的有误");
                    }
                }
            }

        }

        scanner.close();
    }
}
