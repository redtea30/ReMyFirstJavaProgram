package extension;

/**
 * ClassName:ExceptTail357In100
 * Package: extension
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20239:40 pm
 * @Version 1.0
 */
public class ExceptUnit357In100 {
    public static void main(String[] args) {
        //打印100以内除了尾数为3,5,7的所有数
        for (int i = 1; i < 101; i++) {
            if (i >= 10) {
                if (i % 10 == 3 || i % 10 == 5 || i % 10 == 7) {
                    continue;
                }
            } else {
                if (i == 3 || i == 5 || i == 7) {
                    continue;
                }

            }        System.out.println(i);

        }


    }
}
