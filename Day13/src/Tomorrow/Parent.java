package Tomorrow;

/**
 * ClassName:Parent
 * Package: Tomorrow
 * Description:
 *
 * @Author Neko
 * @Create 16/8/202311:50 pm
 * @Version 1.0
 */
public class Parent {
    protected int age;
    protected String name;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Parent() {
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

