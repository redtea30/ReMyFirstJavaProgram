package RE;

/**
 * ClassName:RE.RunnerLiSI
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20234:56 pm
 * @Version 1.0
 */
public class RunnerLiSI {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("李四跑多少天");
        int countdown = scanner.nextInt();*/
                    //固定天数 20
        int countdown = 20;//9600
        int weekCount = countdown / 7;
        int dailyRunningDistance = 0;
        int runningDistance = 0;
        for (int i = 0; i < weekCount; i++) {//计算完整周
            dailyRunningDistance = 100 * (i + 1);//每周一都加一次
            for (int j = 1; j <= 7; j++) {
                runningDistance += dailyRunningDistance;
                dailyRunningDistance += 100;
            }
        }
        dailyRunningDistance = (weekCount + 1) * 100;
        for (int k = 1; k <= countdown % 7; k++) {
            runningDistance += dailyRunningDistance;
            dailyRunningDistance += 100;
        }
        System.out.println(runningDistance);

    }
}
