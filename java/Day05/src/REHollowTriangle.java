/**
 * ClassName:HollowTriangle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/8/202312:34 pm
 * @Version 1.0
 */
public class REHollowTriangle {
    public static void main(String[] args) {
        //输入行数 显示如图所示的空心三角形
        /*
         -------*
         -----*   *
         ----*      *
         ---*         *
         --* * * * * * *
         */

        int height = 4;
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < height - i+6; j++){
                System.out.print("  ");
            }
            for (int k = 0; k <= 4 * i; k++) {
                if (k == 0 || k == 4 * i) {
                    System.out.print("*");
                } else if (i == height ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }


    }
}
