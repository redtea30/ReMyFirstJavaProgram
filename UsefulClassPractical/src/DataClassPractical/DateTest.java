package DataClassPractical;

import java.util.Date;

/**
 * ClassName:DateTest
 * Package: DataClassPractical
 * Description:
 *
 * @Author Neko
 * @Create 25/8/20236:28 pm
 * @Version 1.0
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//Fri Aug 25 18:33:06 SGT 2023
        //date 对象默认创建的对象是当前系统时间

        Date date1 = new Date(0);
        System.out.println(date1);//Thu Jan 01 07:30:02 SGT 1970

        System.out.println(date.getTime());//1692959652767
        System.out.println(date1.getTime());//2000
        //Date.getTime(); 获取当前的毫秒数
        System.out.println(date.getYear());//123
        System.out.println(date1.getYear());//70
        //Date.getYear(); 获取当前的年份，从1900年开始计，2023年为123，1970年为70
        System.out.println(date.getMonth());//7
        System.out.println(date1.getMonth());//0 默认是0
        //Date.getMonth(); 获取当前月份
        //range: 0-11
        System.out.println(date.getDate());//25
        System.out.println(date1.getDate());//1
        //Date.getDate(); 获取当前日期，月中的几号
        System.out.println(date.getHours());//19
        System.out.println(date1.getHours());//1
        //Date.getHour(); 获取当前小时数，24小时计
        System.out.println(date.getMinutes());//5
        System.out.println(date1.getMinutes());//30
        //Date.getMinutes; 获取当前分钟数，
        // Default: 1970/01/01 07:30:00
        System.out.println(date.getSeconds());//42
        System.out.println(date1.getSeconds());//0
        //Date.getSeconds(); 获取当前秒数


        System.out.println(date1);//Thu Jan 01 07:30:00 SGT 1970
        //1000 millisecond == 1 second
        date1.setTime(60000);
        System.out.println(date1);//Thu Jan 01 07:31:00 SGT 1970
        date1.setTime(-60000);
        System.out.println(date1);//Thu Jan 01 07:29:00 SGT 1970
        // Date.setTime(); 可以给date对象增加或减少时间
        // 参考calendar类，貌似有bug，未使用get等获取类方法时，date对象的毫秒数不会更新
        //因此增一分减一分不是原时间

        date1.setTime(60000);
        date1.getTime();
        date1.setTime(-60000);
        date1.getTime();
        System.out.println(date1);//Thu Jan 01 07:29:00 SGT 1970
        //这样就能避免卡BUG情况




    }


}
