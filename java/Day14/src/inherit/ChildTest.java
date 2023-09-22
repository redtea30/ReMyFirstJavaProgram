package inherit;

/**
 * ClassName:ChildTest
 * Package: inherit
 * Description:
 *
 * @Author Neko
 * @Create 17/8/20233:40 pm
 * @Version 1.0
 */
public class ChildTest {
    public static void main(String[] args) {
        Child child = new Child("child", 123, "open University");
        Parent child1 = new Child("parent", 456, "江南");

        //Child child2 = new Parent("parent", 789);
        child.printInfo();
        child1.printInfo();
        System.out.println(child.test1);
        System.out.println(child.test2);
        System.out.println(child1.test1);
        System.out.println(child1.test2);

        Child child2 = new Child();//子类会默认调用父类
        Parent child3 = new Parent();

        System.out.println();
        child.print();//child
        System.out.println();
        child1.print();//parent?
        System.out.println();
        child2.print();//child
        child3.print();//parent

    }
}
