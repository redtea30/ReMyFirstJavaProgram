/**
 * ClassName:XMarsTree
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20237:01 pm
 * @Version 1.0
 */
public class XMasTree {
    public static void main(String[] args) {
        //尖尖
        for (int i = 0; i < 3; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("-");
            }
            for (int k = 3; k < i + 4; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //尖尖底下
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3 + i; j++) {
                System.out.print("--");
            }
            for (int k = 5; k >2*i ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //第二个伞底
        for (int i = 0; i < 2; i++) {
            for (int j = 6; j > 2*i; j--) {
                System.out.print("-");
            }
            for (int k = 1; k <2* i+6 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //第三个伞
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j > 2*i; j--) {
                System.out.print("-");
            }
            for (int k = 1; k <2* i+6 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //树墩
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <7; j++) {
                System.out.print("-");
            }
            for (int k = 0; k <4 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }






    }
}
