import java.util.Scanner;

/**
 * ClassName:TextSquire
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20232:15 pm
 * @Version 1.0
 */
public class TextSquire {
    public static void main(String[] args) {
        /*一个循环，打印输出一个由字符构成的正方形图案，其中边长由用户输入确定。要求字符按照以下顺序循环使用：'#','@','*'。例如，当边长为 5 时，输出如下：*/
//# @ @ @ #
//@ * * * @
//@ * * * @
//@ * * * @
//# @ @ @ #
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要的四边形大小");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == input - 1) || (i == input - 1 && j == 0) || (i == input - 1 && j == input - 1))
                    System.out.print("#");
                else if (j == 0 || i == 0 || j == input - 1 || i == input - 1) {
                    System.out.print("@");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        scanner.close();
    }
}
