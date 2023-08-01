package assignment;

import java.util.Scanner;

/**
 * ClassName:Triangle
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20237:00 pm
 * @Version 1.0
 */
public class Triangle {
    public static void main(String[] args) {
        // 编写一个Java程序，接收用户输入的一个三角形的三个边长，判断这三条边是否能构成一个三角形，并输出相应的结果。
        //不做大小判断，对任意两边相加大于第三边即可。 即： a+b>c&&a+c>b&&b+c>a
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个边");
        int side1 = scanner.nextInt();
        System.out.println("请输入第二个边");
        int side2 = scanner.nextInt();
        System.out.println("请输入第三个边");
        int side3 = scanner.nextInt();
        //判断条件
        Boolean istrue = (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
        System.out.println(istrue);
    }
}
