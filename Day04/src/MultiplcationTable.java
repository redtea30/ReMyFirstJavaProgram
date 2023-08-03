/**
 * ClassName:MultiplcationTable
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20232:48 pm
 * @Version 1.0
 */
public class MultiplcationTable {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j+"\t");
            }
            System.out.println();
        }
    }
}
