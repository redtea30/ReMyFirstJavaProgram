package Tomorrow;

public class Child extends Parent {
    private String school;

    public Child(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

}

class Test {
    public static void main(String[] args) {
        Child c = new Child("Jerry", 10, "Primary School");
        c.printInfo();
    }
}