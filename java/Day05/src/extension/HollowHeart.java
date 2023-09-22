package extension;

/**
 * ClassName:HollowHeart
 * Package: extension
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20238:27 pm
 * @Version 1.0
 */
public class HollowHeart {
    public static void main(String[] args) {
        //实验性质

        float size =15.5f;
        for (int i = 0; i <size; i++) {
            for (int j =1; j <size-i; j+=0.5f) {
                System.out.print("-");
            }

            System.out.println();
        }
    }
}
