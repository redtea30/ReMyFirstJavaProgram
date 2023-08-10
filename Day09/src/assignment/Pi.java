package assignment;

/**
 * ClassName:Pi
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 10/8/20238:22 pm
 * @Version 1.0
 */
public class Pi {
    public static void main(String[] args) {
        //编写一个Java程序，使用循环计算Π的近似值。可以使用Leibniz级数来近似的值:  = 4 * (1 - 1/3+
        //1/5 - 1/7 + 1/9 - 1/11 + ...)，通过增加级数项的数量来改进近似结果。

        double back = 0;

        int size = 10000;
        int count = 0;
        for (double i = 1; i < size; i+=2) {
            count++;

            if (count % 2 == 0) {
                back += ((double)1.0 / i);
            } else {
                back +=((double) -1.0 / i);
            }
        }

        System.out.println(4 * back);
    }
}
