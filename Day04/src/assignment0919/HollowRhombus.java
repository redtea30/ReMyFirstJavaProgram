package assignment0919;

/**
 * ClassName:assignment.Rhombus
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20234:49 pm
 * @Version 1.0
 */
public class HollowRhombus {
    public static void main(String[] args) {
        //空心菱形
        //reference
        //https://www.cnblogs.com/navyouth/p/7839750.html
        //https://www.796t.com/content/1544568849.html

        //上半
        for (int i = 1; i < 8; i++) {
            //上半左边空白部分
            for (int j = 1; j < 8 - i; j++) {
                System.out.print("-");
            }
            //上半菱形
            for (int k = 1; k < 17; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        //下半
        for (int i=7 ;i >1 ; i--) {
            //下半左边空白部分
            for (int j = 0; j <= 6 - i; j++) {
                System.out.print("-");
            }
            for (int j = 0; j <15; j++) {

                if (j == 1 || j == 2 * i - 3) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }
}
