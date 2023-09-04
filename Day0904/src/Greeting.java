import java.time.LocalTime;

/**
 * ClassName:Greeting
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/9/202312:00 pm
 * @Version 1.0
 */
public enum Greeting {
    Morning("早上好"), noon("中午好"), afternoon("下午好"), evening("晚上好");
    private String name;


    Greeting() {
    }

    Greeting(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void greeting(LocalTime localtime) {
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
    }
}
