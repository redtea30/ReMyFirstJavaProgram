/**
 * ClassName:Rhombus
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20234:49 pm
 * @Version 1.0
 */
public class Rhombus {
    public static void main(String[] args) {
        //上件尖尖
        for (int i = 5; i < 7; i++) {
            //blank
            for (int j = 0; j < 12 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i - 4; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //上左右
        for (int i = 1; i < 6; i++) {
            //blank
            for (int j = 1; j < 7 - i; j++) {
                System.out.print(" ");
            }
            //左
            for (int k=1; k <= i+1; k++) {
                System.out.print("*");
            }
            //中间空格
            System.out.print("\s");
            //右
            for (int k=1; k <= i+1; k++) {
                System.out.print("*");
            }
                System.out.println();
        }

        //下左右
        for (int i = 6; i > 0; i--) {
            //blank
            for (int j = 1; j < 7 - i; j++) {
                System.out.print(" ");
            }
            //左
            for (int k=1; k <= i+1; k++) {
                System.out.print("*");
            }
            //中间空格
            System.out.print("\s");
            //右
            for (int k=1; k <= i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //下件尖尖
        for (int i = 6; i >=5; i--) {
            //blank
            for (int j = 0; j < 12 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i - 4; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
