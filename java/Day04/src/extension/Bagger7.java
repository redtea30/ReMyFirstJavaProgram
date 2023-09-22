package extension;

/**
 * ClassName:Bagger7
 * Package: extension
 * Description:
 *
 * @Author Neko
 * @Create 3/8/20239:34 pm
 * @Version 1.0
 */
public class Bagger7 {
    public static void main(String[] args) {
        //洪乞丐干10天，收入是多少？
        //天朝有一个乞丐姓洪，去天桥要钱
        //第一天要了1块钱
        //第二天要了2块钱
        //第三天要了4块钱
        //第四天要了8块钱
        //以此类推
        int total = 0;
        int days = 1;
        int income = 1;
        do {
            total += income;////////////////////////////////////////////////
            income += income;
            days++;
        } while (days <= 10);
        System.out.println(total);
        System.out.println(days);
    }
}

