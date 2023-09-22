import org.junit.jupiter.api.Test;

/**
 * ClassName:SwitchCase01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20232:09 pm
 * @Version 1.0
 */
public class SwitchCase01 {
    @Test
    public void test1() {
        //案例3：使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
        int score = 59;
        switch (score / 10) {
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("及格");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("不及格");
            default:
                break;


        }

    }

    @Test
    public void test2() {
        //案例3：使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
        int score = 59;
        switch (score / 10) {
            case 10, 9, 8, 7, 6 -> System.out.println("及格");
            case 5, 4, 3, 2, 1, 0 -> System.out.println("不及格");


        }


    }
}
