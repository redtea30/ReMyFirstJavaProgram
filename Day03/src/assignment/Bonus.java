package assignment;

import java.util.Scanner;

/**
 * ClassName:Bonus
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20236:47 pm
 * @Version 1.0
 */
public class Bonus {
    public static void main(String[] args) {
/*           编写一个程序，根据员工的工龄来计算年终奖金。奖金计算规则如下：
                 工龄小于等于5年，奖金为工资的5%
                工龄大于5年且小于等于10年，奖金为工资的10%
                工龄大于10年，奖金为工资的15%*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工的工资");
        int salary = scanner.nextInt();
        System.out.println("请输入员工的工作年龄");
        int bounus = scanner.nextInt();
        double yearEndBouns = 0;

        if (salary > 0 && bounus > 0) {
            if (bounus > 0 && bounus <= 5) {
                yearEndBouns = salary * 0.05 * 12;
            } else if (bounus > 5 && bounus <= 10) {
                yearEndBouns = salary * 0.1 * 12;
            } else if (bounus > 10) {
                yearEndBouns = salary * 0.15 * 12;
            }

            System.out.println("该员工的年终奖为" + yearEndBouns);
        } else {
            System.out.println("你的输入有误");
        }
    }
}
