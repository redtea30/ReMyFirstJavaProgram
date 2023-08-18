/**
 * ClassName:ObjectOverrideTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 18/8/202311:45 am
 * @Version 1.0
 */
public class ObjectOverrideTest {

    public static void main(String[] args) {
        ObjectOverride oo1 = new ObjectOverride("test1",'w',123);
        ObjectOverride oo2 = new ObjectOverride("test1",'w',123);

        System.out.println(oo1.toString());

        System.out.println(oo1.equals(oo2));








    }








}
