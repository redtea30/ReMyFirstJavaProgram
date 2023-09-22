package OOP;

/**
 * ClassName:OOPArray
 * Package: OOP
 * Description:
 *
 * @Author Neko
 * @Create 1/8/202311:16 pm
 * @Version 1.0
 */
public class OOPArray {

    public String name;
    public String gender;
    public int age;

    public static void main(String[] args) {
        //对象数组
        //创建第一个对象
        Person dio = new Person();
        dio.name = "DIO";
        dio.gender = "male";
        dio.age = 2000;
        //创建第二个对象
        Person jojo = new Person();
        jojo.name = "JOJO";
        jojo.gender = "male";
        jojo.age = 20;
        //定义person类型的数组，并初始化数组元素
        Person[] persons = new Person[]{
                dio,
                jojo
        };
        //输出
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].name + "," + persons[i].gender + "," + persons[i].age);
        }


    }


}
