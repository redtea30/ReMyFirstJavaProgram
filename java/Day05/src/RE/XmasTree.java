package RE;

/**
 * ClassName:XmasTree
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20237:46 pm
 * @Version 1.0
 */
public class XmasTree {
    public static void main(String[] args) {

        int size = 5;
        //绘制第一个树伞
        for (int i = 0; i <= size; i++) {
            for (int j = 1; j < size - i + 10; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //绘制第二个树伞
        for (int i = 0; i <= size - 2; i++) {
            for (int j = 1; j < size - i + 7; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i + 1 + 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //第三个树伞
        for (int i = 0; i <= size - 2; i++) {
            for (int j = 1; j < size - i + 7; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i + 1 + 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size + 7; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
