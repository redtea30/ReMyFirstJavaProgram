/**
 * ClassName:TwentyThree
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 12/8/20235:15 pm
 * @Version 1.0
 */
public class TwentyThree {
    public static void main(String[] args) {
        //23。有5位同学的姓名存储在一个一维数组 names 中，他们的三科(数学，语文，英语)成绩，
        // 存储在一个二维数组 scores 中，请根据语文成绩隆序排名并输出每个人及其各科成绩。

        String[] names = {"one", "two", "three", "four", "five"};
        int[][] scores = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}, {10, 11, 12}, {13, 14, 15}};

        //对语文成绩进行排序，顺便把names也排序了
        for (int i = 1; i < scores.length; i++) {
            for (int j = 0; j < scores.length - i; j++) {
                if (scores[j][1] < scores[j + 1][1]) {
                    int temp = scores[j][1];
                    scores[j][1] = scores[j + 1][1];
                    scores[j + 1][1] = temp;
                    String temp1 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp1;
                }
            }
        }
        System.out.println("names\tmath\tmandarin\tenglish\t");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(names[i] + "\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
