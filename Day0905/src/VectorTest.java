import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

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
        //new2.copyInto(str);
        //System.out.println(new2.toString());
        //下午看下copyInfo怎么回事

        String[] str2 = new String[20];
        //直接toString
        System.out.println(newVec.toString());

        //copyInto
        //不移除第五个就没法用
        newVec.remove(5);
        newVec.copyInto(str2);
        System.out.println("str2 toString " + Arrays.toString(str2));

        //Iterator输出
        System.out.println("iterator Interface");
        Iterator ite = newVec.iterator();
        while (ite.hasNext()) {
            System.out.println((String) ite.next());
        }
        //for i
        System.out.println("for循环");
        for (int i = 0; i < newVec.toArray().length; i++) {
            System.out.println(newVec.get(i));
        }
        //for each
        System.out.println("for循环");
        for (Object obj : newVec) {
            System.out.println(obj);
        }
        //for each(consumer) method
        System.out.println("for each (consumer)Interface");
        newVec.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

        //for each Lambda 表达式
        System.out.println("for each lambda");
        newVec.forEach((o) -> System.out.println(o));


        //comparator

        Vector newVec1 = new Vector();
        newVec1.add("1");
        newVec1.add("2");
        newVec1.add("3");
        newVec1.add("4");
        newVec1.add("5");
        newVec1.add("6");
        System.out.println(newVec1.toString());//[1, 2, 3, 4, 5, 6]
        Object vec = newVec1.get(1);
        if (vec instanceof String) vec = "10";//这里使用str1接受会导致作用范围不够
        newVec1.set(1, vec);
        System.out.println(newVec1.toString());//[1, 10, 3, 4, 5, 6]

        newVec1.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String s1 && o2 instanceof String s2)
                    return Integer.parseInt(s1) - Integer.parseInt(s2);
                return 0;
            }
        });
        System.out.println(newVec1.toString());//[1, 3, 4, 5, 6, 10]

        newVec1.sort((o1, o2) -> {
            if (o1 instanceof String s1 && o2 instanceof String s2)
                return Integer.parseInt(s1) - Integer.parseInt(s2);
            return 0;
        });


    }
}
