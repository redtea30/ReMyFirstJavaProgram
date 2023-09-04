/**
 * ClassName:ReLinkTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 1/9/20232:13 pm
 * @Version 1.0
 */
public class ReLinkTest {
    public static void main(String[] args) {
        ReLInked rl = new ReLInked();
        System.out.println("isEmpty  " + rl.isEmpty());
        Student stu = new Student("张三", 10);
        Student stu1 = new Student("张4", 19);
        Student stu2 = new Student("张5", 20);
        Student stu3 = new Student("张6", 23);
        System.out.println("size " + rl.size());
        System.out.println("add+Stu " + rl.add(stu));
        System.out.println("size " + rl.size());
        System.out.println("contains stu " + rl.contain(stu));
        System.out.println("delete stu " + rl.delete(stu));
        System.out.println("contains stu  " + rl.contain(stu));
        System.out.println("add+Stu " + rl.add(stu));
        System.out.println("add+Stu1 " + rl.add(stu1));
        System.out.println("add+Stu2 " + rl.add(stu2));
        System.out.println("add+Stu3 " + rl.add(stu3));
        System.out.println("isEmpty " + rl.isEmpty());
        System.out.println("size " + rl.size());
        System.out.println("contains stu  " + rl.contain(stu));
        System.out.println("contains stu1  " + rl.contain(stu1));
        System.out.println("contains stu2  " + rl.contain(stu2));
        System.out.println("contains stu3  " + rl.contain(stu3));
        System.out.println("size " + rl.size());
        System.out.println(rl.toString());
        //这里有问题，怎么是5

        rl.cleanUp();
        System.out.println("size "+rl.size());
        System.out.println("add stu " + rl.add(stu));
        System.out.println("size "+rl.size());
        System.out.println("add stu " + rl.add(stu));
        System.out.println("size "+rl.size());
        System.out.println(rl.toString());
        //Linked[ Student{name='张三', age=10}
        // , Student{name='张三', age=10} ]
        System.out.println("size "+rl.size());
        System.out.println("add stu1 " + rl.add(stu1));
        System.out.println("size "+rl.size());
        System.out.println("add stu2 " + rl.add(stu2));
        System.out.println("size "+rl.size());//4
        System.out.println(rl.toString());
        //Linked[ Student{name='张三', age=10}
        // , Student{name='张三', age=10}
        // , Student{name='张三', age=10}
        // , Student{name='张三', age=10} ]
        System.out.println("size "+rl.size());
        System.out.println("add stu3 " + rl.add(stu3));
        System.out.println("size "+rl.size());
        System.out.println("add stu2 " + rl.add(stu2));
        System.out.println("size "+rl.size());//6
        System.out.println(rl.toString());
        //Linked[ Student{name='张三', age=10}
        // , Student{name='张三', age=10}
        // , Student{name='张三', age=10}
        // , Student{name='张三', age=10}
        // , Student{name='张三', age=10}
        // , Student{name='张三', age=10} ]

        //为啥测试没问题，妈的
        System.out.println("indexOf 5 "+rl.indexOf(5).toString());
        Object test1= rl.indexOf(5);
        System.out.println("delete 5 "+rl.delete(rl.indexOf(5)));
        System.out.println("contain test1 deleted  "+rl.contain(test1));
        System.out.println(rl.contain("kas"));
        System.out.println(rl.contain("sdfasdfsdf"));
        System.out.println(rl.contain("kasdfasdfs"));
        System.out.println(rl.contain("kaasdfs"));
        System.out.println(rl.contain("kasdfas"));
        System.out.println(rl.toString());


    }
}
