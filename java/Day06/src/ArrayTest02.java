/**
 * ClassName:ArrayTest02
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 7/8/202311:41 am
 * @Version 1.0
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        // 需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
        // 1. 定义一个数组存储 5名员工的销售额
        // 2. 获取每个员工的销售额
        // 3. 相加
        int[] saleroom = new int[]{16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < saleroom.length; i++) {
            System.out.println("员工" + (i + 1) + "当日销售额" + saleroom[i]);
            sum += saleroom[i];
        }
        System.out.println(sum+"所有员工的销售额");

    }
}
