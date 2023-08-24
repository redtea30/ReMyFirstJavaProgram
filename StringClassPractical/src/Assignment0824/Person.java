package Assignment0824;

import java.util.Objects;

import static Assignment0824.Person.canMerry;

/**
 * ClassName:Person
 * Package: Assignment0824
 * Description:
 *
 * @Author Neko
 * @Create 24/8/20237:02 pm
 * @Version 1.0
 */
public class Person {
    private String name;
    private Character gender;
    private Integer age;
    private Boolean marry;


    public Person() {
    }

    public Person(String name, Character gender, Integer age, Boolean marry) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.marry = marry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarry() {
        return marry;
    }

    public void setMarry(Boolean marry) {
        this.marry = marry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(gender, person.gender) && Objects.equals(age, person.age) && Objects.equals(marry, person.marry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, marry);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", marry=" + marry +
                '}';
    }

    public static boolean canMerry(Person p1, Person p2) {
        boolean gender = !(p1.getGender().equals(p2.getGender()));
        if (!gender) return false;
        boolean age = p1.getAge().equals("male") ? (p1.getAge() > 22) : (p1.getAge() > 20);
        boolean age1 = p2.getAge().equals("male") ? (p2.getAge() > 22) : (p2.getAge() > 20);
        if (age == false && age1 == false) return false;
        boolean isMarried = p1.getMarry() || p2.getMarry();
        if (isMarried) return false;

        return true;

    }


}

class CAN {

    public static void main(String[] args) {
        Person p1 = new Person("李小明", '男', 90, false);
        Person p2 = new Person("叽叽叽", '女', 90, false);
        System.out.println(canMerry(p1, p2));
        Person p3 = new Person("看看看", '女', 90, false);
        Person p4 = new Person("叽叽叽", '女', 10, false);
        System.out.println(canMerry(p3, p4));



    }
}