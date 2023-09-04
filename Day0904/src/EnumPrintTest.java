import java.time.LocalTime;

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

        //valueOf(String s)

        System.out.println(EnumTest.valueOf("tuesday"));
        System.out.println(EnumTest.valueOf("monday"));

        LocalTime now1 = LocalTime.now();
        Greeting.greeting(now1);

    }

/*    public static void greeting(LocalTime localtime) {
        Greeting afternoon = Greeting.afternoon;
        Greeting noon = Greeting.noon;
        Greeting evening = Greeting.evening;
        Greeting Morning = Greeting.Morning;
        int hour = localtime.getHour();
        if (hour >= 4 && hour <= 12) System.out.println("早上好");
        else if (hour > 12 && hour <= 15) System.out.println("中午好");
        else if (hour > 15 && hour <= 20) System.out.println("下午好");
        else if (hour > 20 && hour <= 24 || hour >= 0 && hour < 4) System.out.println("晚上好");
        else System.out.println("输入错误");
    }*/


}


