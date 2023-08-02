package experimentalTest;

/**
 * ClassName:Getter
 * Package: experimentalTest
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20237:58 pm
 * @Version 1.0
 */
class Person {
    private int age;
    private String name;
    private String gender;


    public Person() {
        //通过this(); 的形式调用当前对象的构造方法
        this(1,"John","Female");
/*        //为空构造方法赋值
        name = "John";
        age = 1;
        gender = "Female";*/
    }

    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }














}
