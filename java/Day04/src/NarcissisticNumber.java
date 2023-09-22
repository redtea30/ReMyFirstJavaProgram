/**
 * ClassName:NarcissisticNumber
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202311:28 am
 * @Version 1.0
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
//        输出所有的水仙花数
        int i;
        for (i = 100; i < 1000; i++) {
            int hundred = i / 100;
            int tens = i / 10 % 10;
            int unit = i % 10;
            if (Math.pow(hundred,3)+Math.pow(tens,3)+Math.pow(unit,3)==i){
                System.out.println(i +"- 是水仙花数");
            }
        }


    }
}
