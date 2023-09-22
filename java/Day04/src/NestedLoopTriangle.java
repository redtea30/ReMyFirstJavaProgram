/**
 * ClassName:NestedTriangle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20232:44 pm
 * @Version 1.0
 */
public class NestedLoopTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j >i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
