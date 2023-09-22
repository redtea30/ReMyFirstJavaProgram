/**
 * ClassName:Third_NarcissisticNumber
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/20238:21 am
 * @Version 1.0
 */
public class Third_NarcissisticNumber {
    public static void main(String[] args) {
        //【程序3】
        //题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
        for (int i = 100; i < 1000; i++) {
            int unit = i % 10;
            int tens = i / 10 % 10;
            int hundred = i / 100;
            double check = Math.pow(unit,3)+Math.pow(tens,3)+Math.pow(hundred,3);
            if ((int)check==i ){
                System.out.println(i);
            }
        }
    }
}
