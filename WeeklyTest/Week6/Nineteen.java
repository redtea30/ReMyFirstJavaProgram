package Week6;

/**
 * ClassName:Nineteen
 * Package: Week6
 * Description:
 *
 * @Author Neko
 * @Create 27/8/202312:19 pm
 * @Version 1.0
 */
public class Nineteen {
    public static void main(String[] args) {
        Integer a = new Integer(10);//这里intellij会报错但是能运行
        Integer b = new Integer(10);//提示原因是，废弃并标记删除，太旧了
        System.out.println((a == b) + "\t");//false 地址值不同
        a = 100;
        b = 100;
        System.out.println((a == b) + "\t");//true 缓存池机制
        Integer c = a;
        System.out.println((a == c) + "\t");//true 缓存池机制
        a = 200;
        b = 200;
        System.out.println((a == b) + "\t");//false 缓存池机制
        int d = 200;
        Double e = 200.0;
        System.out.println((b == d) + "\t");//true 自动拆箱
        System.out.println((d == e) + "\t");//true 自动拆箱
        System.out.println(e == 200.0);//true 自动拆箱
    }
}
