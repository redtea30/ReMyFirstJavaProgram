package kaifamiao_cinema;

import java.time.LocalTime;

/**
 * ClassName:Greeting
 * Package: kaifamiao_cinema
 * Description:用于判断当前时间以及返回问候语
 *
 * @Author Neko
 * @Create 4/9/20232:06 pm
 * @Version 1.0
 */
public enum Greeting {
    GREETING;
    private String name;
    private int hour;

    Greeting() {
        LocalTime lc = LocalTime.now();
        hour = lc.getHour();
    }


    /**
     * 简化写法，只调用一个对象进行判断
     *
     * @return
     */
    public static String greeting() {
        Greeting greeting = Greeting.GREETING;
        int hour = greeting.hour;
        if (hour >= 4 && hour <= 12) return "早上好";
        else if (hour > 12 && hour <= 15) return "中午好";
        else if (hour > 15 && hour <= 20) return "下午好";
        else return "晚上好";
    }

}
