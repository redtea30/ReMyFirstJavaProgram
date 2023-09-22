import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName:HashSetpractice
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 7/9/202311:36 am
 * @Version 1.0
 */
public class HashSetPractice {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student stu = new Student("da");
        Student stu1 = new Student("er");
        Student stu2 = new Student("sab");
        Student stu3 = new Student("si");
        Student stu4 = new Student("wu");
        Student stu5 = new Student("liu");
        Student stu6 = new Student("qi");
        Student stu7 = new Student("ba");
        Student stu8 = new Student("jiu");
        Student stu9 = new Student("shi");
        hs.add(stu);
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        hs.add(stu4);
        hs.add(stu5);
        hs.add(stu6);
        hs.add(stu7);
        hs.add(stu8);
        hs.add(stu9);

        System.out.println(hs.size());
        System.out.println(hs.contains(3));
        System.out.println("hs.hashCode() " + hs.hashCode());


        Iterator ite = hs.iterator();
        while (ite.hasNext()) {
            System.out.println("hashCode() " + ite.next().hashCode());
        }

        hs.forEach(o-> System.out.println(o.toString()));

    }
}
