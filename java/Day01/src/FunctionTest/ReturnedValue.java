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
public class ReturnedValue {
    public static double average() {
        //在定义方法时返回double类型
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入你的成绩1");
        int rec1 = scanner.nextInt();
        System.out.println("请输入你的成绩2");
        int rec2 = scanner.nextInt();
        System.out.println("请输入你的成绩3");
        int rec3 = scanner.nextInt();
        double result = (rec1 + rec2 + rec3) * 1.0 / 3;
        System.out.println("该学生的成绩是" + result);
        return result;
        //result使用return进行返回，并将result返回给主方法
    }

    public static void main(String[] args) {
        double result1 = average();
        double result2 = average();
        double result3 = average();
        System.out.println("result1"+result1);
        System.out.println("result2"+result2);
        System.out.println("result3"+result3);
    }
}
