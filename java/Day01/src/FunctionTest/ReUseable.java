package FunctionTest;

/**
 * ClassName:ReUseable
 * Package: Variabletest
 * Description:
 *
 * @Author Neko
 * @Create 31/7/202311:43 pm
 * @Version 1.0
 */
public class ReUseable {
    public static void average() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入你的成绩1");
        int rec1 = scanner.nextInt();
        System.out.println("请输入你的成绩2");
        int rec2 = scanner.nextInt();
        System.out.println("请输入你的成绩3");
        int rec3 = scanner.nextInt();
        double result = (rec1 + rec2 + rec3) * 1.0 / 3;
        System.out.println("该学生的成绩是" + result);
    }

    public static void main(String[] args) {
        average();
        //average(); 方法调用三遍就执行三次

//        发出调用方法的称为主调方法（main()方法），被调用的方法被称为被调方法
    }
}
