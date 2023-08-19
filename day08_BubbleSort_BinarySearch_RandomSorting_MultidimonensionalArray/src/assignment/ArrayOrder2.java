package assignment;

/**
 * ClassName:ArraysOrder
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 9/8/20237:47 pm
 * @Version 1.0
 */
/*public class ArrayOrder2 {
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
        int[] scoreOrder = new int[scores.length];
        //新建数组对课程表进行修改，增加总成绩
        String[] courses1 = Arrays.copyOf(courses, courses.length + 1);
        courses1[courses.length] = "总成绩";
        System.out.println(Arrays.toString(courses1));
        //2. 设计程序，根据学生总成绩进行排序(降序排列)，并输出学生姓名、每门课程的名称和该学生的成绩、该学生的总成绩

        //重新生成一个数组，带总成绩
        int[][] withTotalScore = new int[scores.length][scores[1].length + 1];
        for (int i = 0; i < scores.length; i++) {
            withTotalScore[i] = Arrays.copyOf(scores[i], 4);
            //把总成绩塞进去，序列第四位
            for (int j = 0; j < scores[i].length - 1; j++) {
                withTotalScore[i][3] += withTotalScore[i][j];
                //顺便造个成绩的数组
            }
            scoreOrder[i] = withTotalScore[i][3];
        }
        Arrays.sort(scoreOrder);
        System.out.println(Arrays.toString(scoreOrder));
        for (int[] i : withTotalScore) {
            for (int c : i) {
                System.out.print(c + " ");
            }
            System.out.println();


            int innerScoers = scoreOrder[scores.length - 1 - i];
            int order = 0;//这个数对应总成绩倒排序列
            //在输出循环内直接对数组进行检测，倒排
            for (int a = 0; a < withTotalScore.length; a++) {
                if (innerScoers == withTotalScore[a][3]) {
                    order = a;
                    break;
                }
            }


            System.out.print(names[i] + " => "); // 输出学生姓名
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(courses[j] + ":");// 输出课程名称
                System.out.print(scores[i][j]); // 输出课程成绩
                System.out.println(withTotalScore[j][3]);
                if (j < scores[i].length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }
    }


}*/

