package experimentalTest;

/**
 * ClassName:Parent
 * Package: experimentalTest
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20238:56 pm
 * @Version 1.0
 */
class Parent {

    private int age;
    private String name;

    public Parent() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void printInfo() {
        System.out.println("Name" + getName() + " age" + getAge());
    }


}
