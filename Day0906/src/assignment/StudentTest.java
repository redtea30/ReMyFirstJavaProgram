package assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/**
 * ClassName:StudentTest
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20237:07 pm
 * @Version 1.0
 */
public class StudentTest {
    static ArrayList ls = new ArrayList();
    static Random rand = new Random();

    public static void main(String[] args) {
//2.创建Student类，属性包括id[1-40],scroe[60-100], id属性⾃增，成绩属性随机⽣成。创建集合，保存20个对
//象，找到分数最⾼与最低的学⽣，使⽤List集合实现。
        generate20Student();
        System.out.println(ls.toString());//Student的toString方法已经重写
        findTheHighestAndLowest(ls);

    }

    static void generate20Student() {
        Student stu;
        for (int i = 0; i < 20; i++) {
            int score = rand.nextInt(41) + 60;
            int id = i + 20;
            stu = new Student(id, score);
            ls.add(stu);
        }
    }

    static void findTheHighestAndLowest(ArrayList ls) {
        Student stuHighest = (Student) ls.get(1);
        Student stuLowest = (Student) ls.get(1);
        Iterator it = ls.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            Student stu = (Student) obj;
            if (stu.getScore() > stuHighest.getScore()) {
                stuHighest = stu;
            } else if (stu.getScore() < stuLowest.getScore()) {
                stuLowest = stu;
            }

        }
        System.out.println("Highest Score " + stuHighest.toString());
        System.out.println("Lowest Score " + stuLowest.toString());
    }


}

class SortStudent implements Comparator {

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.<p>
     * <p>
     * The implementor must ensure that {@link Integer#signum
     * signum}{@code (compare(x, y)) == -signum(compare(y, x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * compare(x, y)} must throw an exception if and only if {@code
     * compare(y, x)} throws an exception.)<p>
     * <p>
     * The implementor must also ensure that the relation is transitive:
     * {@code ((compare(x, y)>0) && (compare(y, z)>0))} implies
     * {@code compare(x, z)>0}.<p>
     * <p>
     * Finally, the implementor must ensure that {@code compare(x,
     * y)==0} implies that {@code signum(compare(x,
     * z))==signum(compare(y, z))} for all {@code z}.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     * @throws ClassCastException   if the arguments' types prevent them from
     *                              being compared by this comparator.
     * @apiNote It is generally the case, but <i>not</i> strictly required that
     * {@code (compare(x, y)==0) == (x.equals(y))}.  Generally speaking,
     * any comparator that violates this condition should clearly indicate
     * this fact.  The recommended language is "Note: this comparator
     * imposes orderings that are inconsistent with equals."
     */
    @Override
    public int compare(Object o1, Object o2) {
        Student stu1 = (Student) o1;
        Student stu2 = (Student) o2;

        return stu1.getScore() - stu2.getScore();
    }
}
