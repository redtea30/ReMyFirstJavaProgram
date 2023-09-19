package assignment0919;

import java.util.Arrays;

/**
 * ClassName:ArraysOrder
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 9/8/20237:47 pm
 * @Version 1.0
 */
public class ArrayOrder1 {
    public static void main(String[] args) {
        // 设 names 数组中存放学生姓名
        String[] names = {"安琪拉", "王昭君", "蔡文姬", "妲己", "张良"};
        // 设 courses 数组中依次存放三门课程的名称
        String[] courses = {"C++", "Java", "Python"};
        // 设 scores 数组中依次存储的是 names 数组中各个学生的 C++ 、Java 、Python 课程的成绩
        int[][] scores = {
                {90, 89, 75},
                {59, 40, 100},
                {100, 99, 80},
                {80, 61, 61},
                {60, 100, 99},
        };

        //源文件
/*        for (int i = 0; i < scores.length; i++) {
            System.out.print(names[i] + " => "); // 输出学生姓名
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(courses[j] + ":");// 输出课程名称
                System.out.print(scores[i][j]); // 输出课程成绩
                if (j < scores[i].length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }*/

        // 1.设计程序按照各个学生的 Java 成绩进行排序 ( 降序 )
        //降序：由高到低排序

        //检测score的大小
        System.out.println(scores.length);//5
        int[] scoresList = new int[scores.length];

        //把所有java的成绩打印出来
        for (int i = 0; i < scores.length; i++) {
            scoresList[i] = scores[i][1];
            System.out.print(scoresList[i] + " ");
        }
        System.out.println();
        //正排排序
        Arrays.sort(scoresList);
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scoresList[i] + " ");//40 61 89 99 100
        }
        System.out.println();

        //输出
        for (int i = 0; i < scores.length; i++) {
            int innerScoers = scoresList[scores.length - 1 - i];
            int order = 0;//这个数对应java成绩倒排序列
            //在输出循环内直接对数组进行检测，倒排
            for (int a = 0; a < scores.length; a++) {
                if (innerScoers == scores[a][1]) {
                    order = a;
                    break;
                }
            }

            System.out.print(names[order] + " => "); // 输出学生姓名
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(courses[j] + ":");// 输出课程名称
                System.out.print(scores[order][j]); // 输出课程成绩
                if (j < scores[i].length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.println();

        }
    }
}
