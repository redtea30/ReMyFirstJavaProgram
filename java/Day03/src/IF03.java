import java.util.Scanner;

/**
 * ClassName:IF03
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 2/8/202311:59 am
 * @Version 1.0
 */
public class IF03 {
    public static void main(String[] args) {
        // 需求3：某个公司有一个绩效系统，根据员工的打分输出对应的绩效级别。[0,60) D[60,80) C [80,90) B [90,100] A
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工打分成绩");
        double score = sc.nextDouble();
        if (score >= 0 && score < 60) {
            System.out.println("员工绩效级别：D");
        } else if (score < 80) {
            System.out.println("员工绩效级别：C");
        } else if (score < 90) {
            System.out.println("员工绩效级别：B");
        } else if (score <= 100) {
            System.out.println("员工绩效级别：A");
        } else {
            System.out.println("你输入的成绩不合理");
        }
        System.out.println("绩效评定完毕");
    }
}
