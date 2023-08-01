package OOP;

/**
 * ClassName:CreateClass
 * Package: classtest
 * Description:
 *
 * @Author Neko
 * @Create 1/8/20238:55 pm
 * @Version 1.0
 */
public class Person {//定义Person类
    //对于类的方法进行测试

    public String name;//定义姓名字段
    public int age;//定义年龄字段
    public String gender;//定义性别字段


    public void work() {//定义work方法
        System.out.println(this.name + "的工作理念：吃不完小面包");
    }

    public static void main(String[] args) {
        Person dio = new Person();//实例化对象dio
        dio.name = "DIO";//为对象命名
        dio.age = 2000;
        dio.gender = "male";
        dio.work();

    }
}
