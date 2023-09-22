package RE;

/**
 * ClassName:RunnerLiSi1
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20238:31 pm
 * @Version 1.0
 */
public class RunnerLiSi1 {
    public static void main(String[] args) {

        int dayCount = 20;//9600
        int weekCount = 20 / 7;
        int dailyRunningDistance = 0;
        int totalDistance = 0;
        for (int i = 0; i < weekCount; i++) {
            dailyRunningDistance = (i + 1) * 100;
            for (int j = 1; j <= 7; j++) {
                totalDistance += dailyRunningDistance;
                dailyRunningDistance += 100;
            }
        }
        dailyRunningDistance = (weekCount + 1) * 100;
        for (int i = 1; i <= dayCount % 7; i++) {
            totalDistance += dailyRunningDistance;
            dailyRunningDistance += 100;
        }


        System.out.println("总距离" + totalDistance);

    }
}
