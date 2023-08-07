import java.util.Scanner;

/**
 * ClassName:ArrayTest03
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 7/8/202311:48 am
 * @Version 1.0
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        // 某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分做选手得分


//        int[] player01Score = new int[]{5, 4, 3, 2, 1, 6};
/*        int[] player02Score = new int[]{6, 1, 5, 3, 2, 3};
        int[] player03Score = new int[]{3, 2, 1, 5, 2, 3};*/
//        int playerNum = 3;
        Scanner scanner = new Scanner(System.in);
        int[] player01Score = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("请评委" + (i + 1) + "输入成绩");
            player01Score[i] = scanner.nextInt();
        }

        scanner.close();
        int totalScore = 0;
        for (int i = 0; i < player01Score.length; i++) {
            totalScore += player01Score[i];
        }
        int avgScore = totalScore / player01Score.length;
        System.out.println("选手的平均成绩" + avgScore);

    }
}
