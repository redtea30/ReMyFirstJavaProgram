package extension;

/**
 * ClassName:Test
 * Package: extension
 * Description:
 *
 * @Author Neko
 * @Create 4/8/20237:45 am
 * @Version 1.0
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void GreastCommonMultiple() {
        //
        int a = 30;
        int b = 38;
        int c = a * b;
        if (a < b) {//交换条件，结果把大的数字放前面
            int r = 0;
            r = a;
            a = b;
            b = r;
        }
        while (true) {
            int r = a % b;
            if (r == 0) {
                System.out.println("最小公倍数" + c / b);
                break;
            }
            {
                a = b;
                b = r;
            }
        }
    }

    @org.junit.jupiter.api.Test
    public void LowestCommonDivison() {
/*        System.out.print("请输入a和b");
        Scanner scan = new Scanner(System.in);//以空格作为分隔符
        int a = scan.nextInt();
        int b = scan.nextInt();*/

        int a =38;
        int b =30;
        int middle1, middle2, middle3;
        middle1 = a;
        middle2 = b;
        middle3 = 0;
        for (int i = 0; true; i++) {
            middle3 = middle1 % middle2;
            if (middle3 == 0)
                break;
            else {
                middle1 = middle2;
                middle2 = middle3;
            }
        }
        System.out.println("最大公约数为：" + middle2);

    }
}
