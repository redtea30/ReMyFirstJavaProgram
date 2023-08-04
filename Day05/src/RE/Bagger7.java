package RE;

/**
 * ClassName:Bagger7
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20235:14 pm
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
        int totalDays = 10;//1023
        int income = 1;
        int totalIncomes = 0;
        for (int i = 0; i < totalDays; i++) {
            totalIncomes += income;
            income += income;
        }
        System.out.println(totalIncomes);

    }
}
