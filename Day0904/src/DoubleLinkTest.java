/**
 * ClassName:DoubleLikedTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/9/20235:12 pm
 * @Version 1.0
 */
public class DoubleLinkTest {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println("isEmpty " + dll.isEmpty());

        System.out.println(dll.add("test1"));
        System.out.println(dll.add("test2"));
        System.out.println(dll.add("test3"));
        System.out.println(dll.add("test4"));
        System.out.println(dll.add("test5"));
        System.out.println(dll.add("test6"));
        System.out.println(dll.add("test7"));
        System.out.println(dll.add("test8"));
        System.out.println(dll.add("test9"));

        System.out.println("indexOf 8 " + dll.indexOf(8));
        System.out.println("remove test9 the last one " + dll.remove("test9"));
        System.out.println("indexOf 8  " + dll.indexOf(8));
        System.out.println("before remove indexOf 1  " + dll.indexOf(0));
        System.out.println("remove test1 the first one " + dll.remove("test1"));
        System.out.println("after remove indexOf 1  " + dll.indexOf(0));


    }

}
