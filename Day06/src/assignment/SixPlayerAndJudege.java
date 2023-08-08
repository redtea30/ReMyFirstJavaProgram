package assignment;

/**
 * ClassName:SixPlayerAndJudege
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 7/8/20237:58 pm
 * @Version 1.0
 */
public class SixPlayerAndJudege {
    public static void main(String[] args) {
        //9. 在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的
        //最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算
        //出选手的得分。

        int[] score = {87, 12, 56, 84, 45, 99};
        int min = score[1];
        int max = score[2];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (score[i] < min) min = score[i];
            else if (score[i] > max) max = score[i];
        }
        System.out.println(max + "max" + min + "min");


        for (int i : score) {
            if (i == max||i==min) continue;
            else sum += i;
        }
        int avg = sum / 4;
        System.out.println(avg + "avg");
    }
}
