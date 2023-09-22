package experimentalTest;

/**
 * ClassName:PersonTest
 * Package: experimentalTest
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20238:16 pm
 * @Version 1.0
 */
class PersonTest {
    public static void main(String[] args) {

        // getter and setter
        Person person1 = new Person();
        person1.setName("DIO");
        person1.setAge(2000);
        person1.setGender("M");

        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getGender());

        // 构造方法有默认值时输出默认值
        Person person2 = new Person();
        System.out.println(person2.getAge());
        System.out.println(person2.getName());
        System.out.println(person2.getGender());






    }
}
