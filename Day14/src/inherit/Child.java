package inherit;

/**
 * ClassName:Child
 * Package: inherit
 * Description:
 *
 * @Author Neko
 * @Create 17/8/20233:38 pm
 * @Version 1.0
 */
public class Child extends Parent {
    String name;
    int age;
    String school;
    int test1 = 3;
    static int test2 = 4;

    public Child() {
        System.out.println("child");
    }

    public Child(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void printInfo() {
        System.out.println(name + "\t" + age + "\t" + school);
    }
    public void print(){
        System.out.println("child");
    }

}
