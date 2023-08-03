/**
 * ClassName:Seven
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202311:35 am
 * @Version 1.0
 */
public class Seven {
    public static void main(String[] args) {
//        编写一个Java程序，使用for循环输出所有7的倍数，直到200为止.
        int i = 0;
        while (i <= 200) {
            i++;
            if (i % 7 == 0) {
                System.out.println(i + "-7的倍数");
            }
        }
    }
}
