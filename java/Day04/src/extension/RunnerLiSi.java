package extension;

import java.util.Scanner;

/**
 * ClassName:Runner
 * Package: extension
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202310:06 pm
 * @Version 1.0
 */
public class RunnerLiSi {
    public static void main(String[] args) {
        //李四跑步
        //李四每天跑步
        //第一周周一跑 100 米，周二到周天每天比前一天多 100 米。
        //往后每周以比前一周周一多 100 米。
        //请问 李四 n（控制台输入） 天后跑了多少米
        Scanner scanner = new Scanner(System.in);
        System.out.println("李四跑多少天");
        int countdown = scanner.nextInt();
        int distance = 0;
        int dailyRunningDistance = 100;
        for (int i = 0; i < countdown; i++) {//从day0开始计，day7为下周一
            if (i % 7 == 0) {
                if (i / 7 != 0) {
                    dailyRunningDistance += 100;
                }
                distance += dailyRunningDistance;
            } else {

                int dayOfWeek = i % 7;
                int temp = dailyRunningDistance;
                switch (dayOfWeek) {
                    case 1 -> dailyRunningDistance += (dayOfWeek * 100);
                    case 2 -> dailyRunningDistance += (dayOfWeek * 100);
                    case 3 -> dailyRunningDistance += (dayOfWeek * 100);
                    case 4 -> dailyRunningDistance += (dayOfWeek * 100);
                    case 5 -> dailyRunningDistance += (dayOfWeek * 100);
                    case 6 -> dailyRunningDistance += (dayOfWeek * 100);
                }
                distance += dailyRunningDistance;
                dailyRunningDistance = temp;

            }
        }
        System.out.println("李四跑" + countdown + "天总共跑了（米）" + distance);

    }
}
