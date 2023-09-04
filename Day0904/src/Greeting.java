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
    //常量全部都需要大写
    MORNING("早上好"),
    NOON("中午好"),
    AFTERNOON("下午好"),
    EVENING("晚上好"),
    GREETING;//实际只用这一个
    private String name;
    private int hour;

    Greeting() {
        LocalTime lc = LocalTime.now();
        hour = lc.getHour();
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

    /**
     * 初版解决方案，需要建5个对象
     *
     * @param localtime
     */
    public static void greeting(LocalTime localtime) {
        Greeting afternoon = Greeting.AFTERNOON;
        Greeting noon = Greeting.NOON;
        Greeting evening = Greeting.EVENING;
        Greeting Morning = Greeting.MORNING;
        int hour = localtime.getHour();
        if (hour >= 4 && hour <= 12) System.out.println("早上好");
        else if (hour > 12 && hour <= 15) System.out.println("中午好");
        else if (hour > 15 && hour <= 20) System.out.println("下午好");
        else System.out.println("晚上好");
    }

    /**
     * 简化写法，只调用一个对象进行判断
     *
     * @return
     */
    public static String greetingSimple() {
        Greeting greeting = Greeting.GREETING;
        int hour = greeting.hour;
        if (hour >= 4 && hour <= 12) return "早上好";
        else if (hour > 12 && hour <= 15) return "中午好";
        else if (hour > 15 && hour <= 20) return "下午好";
        else return "晚上好";
    }

}
