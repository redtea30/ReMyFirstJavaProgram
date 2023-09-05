import java.util.Vector;

/**
 * ClassName:VectorTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 5/9/202311:22 am
 * @Version 1.0
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector newVec = new Vector();
        newVec.add("1");
        newVec.add("2");
        newVec.add("3");
        newVec.add("4");
        newVec.add("5");
        System.out.println("size();" + newVec.size());
        System.out.println("newVec capacity();" + newVec.capacity());

        Vector new2 = new Vector(100);
        new2.add("6");
        new2.add("7");
        new2.add("8");
        new2.add("9");
        newVec.add(new2);
        System.out.println("size();" + newVec.size());
        System.out.println("newVec capacity();" + newVec.capacity());
        //显然,直接add另一个Vector会直接塞地址值进去
        System.out.println("last ele:" + newVec.lastElement());
        System.out.println(newVec.lastElement() == new2);

        //使用addAll可以正挨个塞进去
        System.out.println("addAll" + newVec.addAll(new2));
        System.out.println("size();" + newVec.size());
        System.out.println("newVec capacity();" + newVec.capacity());
        System.out.println("newVec toString" + newVec.toString());

        //contains containsAll
        System.out.println("newVec.contains " + newVec.contains("1"));
        System.out.println("newVec.containsAll " + newVec.containsAll(new2));

        //copyInfo
        String[] str = {"11", "12", "13"};
        new2.copyInto(str);
        System.out.println(new2.toString());
        //下午看下copyInfo怎么回事



    }
}
