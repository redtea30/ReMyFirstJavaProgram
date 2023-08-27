package Week6;

/**
 * ClassName:Twentyone
 * Package: Week6
 * Description:
 *
 * @Author Neko
 * @Create 27/8/20232:27 pm
 * @Version 1.0
 */
public class Twenty_one {
    public static void main(String[] args) {
        Object obj = new int[]{1, 2, 3};//line1
        int[] someArray = (int[]) obj;//line2
        for (int i : someArray) {//line3
            System.out.println(i + " ");//1 2 3
        }
    }
}
