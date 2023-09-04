/**
 * ClassName:EnumPrint
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/9/202311:38 am
 * @Version 1.0
 */
public class EnumPrintTest {
    public static void main(String[] args) {
        System.out.println(EnumTest.wednesday);//wednesday
        //直接调用实例会直接生成实例对应的字符串
        EnumTest monday = EnumTest.monday;
        System.out.println(monday.getName());//调用enum的实例局部变量

        //通过values 方法获取enum类的成员数组
        for (EnumTest i : EnumTest.values()) {
            System.out.println(i.getName());
        }

        //获取对应成员下标
        //该下标为enum中实例的顺序位置
        System.out.println(monday.ordinal());//获取monday对象在enum中的位置

    }


}
