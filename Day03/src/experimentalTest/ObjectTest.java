package experimentalTest;

/**
 * ClassName:ObjectTest
 * Package: experimentalTest
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20239:34 pm
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
        ObjectTestPerson person1 = new ObjectTestPerson("Alice", 25);
        ObjectTestPerson person2 = new ObjectTestPerson("Bob", 30);
        ObjectTestPerson person3 = new ObjectTestPerson("Alice", 25);

        System.out.println(person1.equals(person2));//false
        System.out.println(person1.equals(person3));//true


        System.out.println(person1.hashCode());//1963861433
        System.out.println(person2.hashCode());//2075945
        System.out.println(person3.hashCode());//1963861433


        System.out.println(person1.toString());//ObjectTestPerson{name='Alice', age=25}
        System.out.println(person2);//ObjectTestPerson{name='Bob', age=30}
    }
}
