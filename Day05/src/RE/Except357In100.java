package RE;

/**
 * ClassName:Except357In100
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20236:33 pm
 * @Version 1.0
 */
public class Except357In100 {
    public static void main(String[] args) {
        // 打印100以内除了尾数为3,5,7的所有数
        // shu % 10 == 3,5,7
        for (int i = 0; i <= 100; i++) {
            if (i % 10 != 3 && i % 10 != 5 && i % 10 != 7) {//逻辑问题
                System.out.println(i);
            }
        }
//写法1
//        if (!(i % 10 == 3 || i % 10 == 5 || i % 10 == 7)) {
//            System.out.println(i);
//        }


//写法2
//if (i % 10 == 3 || i % 10 == 5 || i % 10 == 7) {
//  // 包含3、5、7之一,不打印
//} else {
//  System.out.println(i);
//}


        /**/
    }
}
