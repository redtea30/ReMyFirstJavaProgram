/**
 * ClassName:LikedTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 31/8/20238:57 pm
 * @Version 1.0
 */
public class LikedTest {
    public static void main(String[] args) {
        Linked link = new Linked();
        Student[] stu = new Student[10];
        stu[0] = new Student("Student1", 65);
        stu[1] = new Student("Student2", 1);
        stu[2] = new Student("Student3", 2);
        stu[3] = new Student("Student4", 345);
        stu[4] = new Student("Student5", 435);
        stu[5] = new Student("Student6", 3456);
        stu[6] = new Student("Student7", 3456);
        stu[7] = new Student("Student8", 35);
        stu[8] = new Student("Student9", 2);
        stu[9] = new Student("Student10", 11);
        System.out.println(stu.toString());

        System.out.println(link.add(stu[0]));
        System.out.println(link.add(stu[1]));
        System.out.println(link.add(stu[2]));
        System.out.println(link.add(stu[3]));
        System.out.println(link.add(stu[4]));
        System.out.println(link.add(stu[5]));
        System.out.println(link.add(stu[6]));
        System.out.println(link.add(stu[7]));
        System.out.println(link.add(stu[8]));
        System.out.println(link.add(stu[9]));

        System.out.println(link.toString());
        //这里会打印出大量的stu空置，不慌，Student类设置有问题，不应该在Student类内设置对象数组
        //还都没赋值

        //以下为方法测试
        System.out.println(link.size());
        System.out.println(link.get(2));
        Object temp =  link.get(2);
        //这里不可以用学生类型接受
        System.out.println(link.remove(link.get(2)));
        System.out.println(link.contains(temp));
         temp =  link.get(0);
        System.out.println(link.contains(temp));
        System.out.println(link.size());

        System.out.println(link.remove(link.get(2)));
        System.out.println(link.size());
        System.out.println(link.remove(link.get(2)));
        System.out.println(link.size());
        System.out.println(link.remove(link.get(0)));
        System.out.println(link.size());
        System.out.println(link.remove(link.get(6)));
        System.out.println(link.size());//7

        System.out.println(link.remove(link.get(5)));
        System.out.println(link.size());//6

        System.out.println(link.remove(link.get(0)));
        System.out.println(link.remove(link.get(0)));
        System.out.println(link.remove(link.get(0)));
        System.out.println(link.remove(link.get(0)));
        System.out.println(link.remove(link.get(0)));
        System.out.println(link.get(0) == null);


        System.out.println(link.size());


    }
}
