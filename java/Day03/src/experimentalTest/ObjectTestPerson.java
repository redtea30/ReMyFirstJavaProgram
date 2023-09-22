package experimentalTest;

/**
 * ClassName:ObjectTestPerson
 * Package: experimentalTest
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20239:33 pm
 * @Version 1.0
 */
public class ObjectTestPerson {
    private String name;
    private int age;

    public ObjectTestPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectTestPerson)) {
            return false;
        }
        ObjectTestPerson otherPerson = (ObjectTestPerson) obj;
        return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }


    @Override
    public String toString() {
        return "ObjectTestPerson{" +
                "name='" + name + '\'' +//   \'  大概是转义字符
                ", age=" + age +
                '}';
    }
}
