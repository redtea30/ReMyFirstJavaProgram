package Teacher;

/**
 * ClassName:Test01
 * Package: Teacher
 * Description:
 *
 * @Author Neko
 * @Create 16/8/202312:11 pm
 * @Version 1.0
 */
public class Test01 {
    {
        a = 5;
        System.out.println("{} 1");
    }
    {
        a = 4;
        System.out.println("{}");
    }
    int a = 1;
    public Test01(int a){
        this.a = a;
        System.out.println("Test03(int b)");
    }
    public Test01(){
        System.out.println("无参构造");
    }
    static {
        System.out.println("static{}");
    }
    //  static{}  {} 1 {} Test03(int b) 10;
    public static void main(String[] args) {
        Test01 c1 = new Test01(10);
        System.out.println(c1.a);
    }
}
