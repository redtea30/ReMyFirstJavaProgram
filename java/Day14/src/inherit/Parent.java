package inherit;

/**
 * ClassName:Parent
 * Package: inherit
 * Description:
 *
 * @Author Neko
 * @Create 17/8/20233:35 pm
 * @Version 1.0
 */
public class Parent {
    String name;
    int age;
    int test1 = 1;
    static int test2 =2;

    public Parent() {
        System.out.println("parent");
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name + "\t" + age);
    }
    public void print(){
        System.out.println("parent");
    }
}
