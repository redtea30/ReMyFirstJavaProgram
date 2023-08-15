/**
 * ClassName:Student
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 15/8/20237:45 pm
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "wangshi";
        student.gender = '男';
        student.age = 30;
        student.id = 123456;
        student.score = 99.9;
        System.out.println(student.say());
    }
}

class Student {
    //**1、**编写一个Student类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。在另一个StudentTest类中的main方法中，创建Student对象，并访问say方法和所有属性，并将调用结果打印输出
    String name;
    char gender;
    int age;
    int id;
    double score;

    public String say() {
        String info = "姓名: " + name + "  gender: " + gender + "  age: " + age + "  id: " + id + " score: " + score;
        return info;
    }
}
