/**
 * ClassName:Fifth_If
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20238:40 am
 * @Version 1.0
 */
public class Fifth_If {
    public static void main(String[] args) {
        //【程序5】
        //题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示

        int score = 90;
        gradeLevel(score);

    }

    public static void gradeLevel(int score) {
        if (score >= 90) System.out.println("A");
        else if (score >= 60 && score < 90) System.out.println("B");
        else System.out.println("C");

    }

}
