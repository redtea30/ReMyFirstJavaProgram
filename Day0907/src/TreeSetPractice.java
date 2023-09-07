import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * ClassName:TreeSetPractice
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 7/9/20233:26 pm
 * @Version 1.0
 */
public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet((o1, o2) -> {
            Student stu = (Student) o1;
            Student stu1 = (Student) o2;
            return stu.getName().compareTo(stu1.getName());
        });
        Student stu1 = new Student("a");
        Student stu2 = new Student("z");
        Student stu3 = new Student("c");
        Student stu4 = new Student("d");
        Student stu5 = new Student("e");
        Student stu6 = new Student("y");
        Student stu7 = new Student("g");

        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);
        ts.add(stu4);
        ts.add(stu5);
        ts.add(stu6);
        ts.add(stu7);


        System.out.println("ts.size " + ts.size());
        Iterator ite = ts.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next().toString());
        }
        //Student{name='a'}
        //Student{name='c'}
        //Student{name='d'}
        //Student{name='e'}
        //Student{name='g'}
        //Student{name='y'}
        //Student{name='z'}


        TreeSet tt = new TreeSet();
        Student1 s1 = new Student1("Alice", 20);
        Student1 s2 = new Student1("Bob", 22);
        Student1 s3 = new Student1("Charlie", 21);
        Student1 s4 = new Student1("David", 19);
        Student1 s5 = new Student1("Eva", 23);
        Student1 s6 = new Student1("Eva1", 23);
        Student1 s7 = new Student1("Eva", 23);

        System.out.println(tt.add(s1));
        System.out.println(tt.add(s2));
        System.out.println(tt.add(s3));
        System.out.println(tt.add(s4));
        System.out.println(tt.add(s5));
        System.out.println(tt.add(s6));
        System.out.println(tt.add(s7));
        System.out.println("tt.size() " + tt.size());


    }
}

class Student1 implements Comparable {
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Object o) {
        Student1 stu = (Student1) this;
        Student1 stu1 = (Student1) o;
        if (stu == stu1) return 0;
        else if (stu == null || stu1 == null) throw new NullPointerException();//应该不必要？
        else if (stu.getAge() != stu1.getAge()) return stu.getAge() - stu1.getAge();
        else if (stu.getAge() == stu1.getAge()) return stu.getName().compareTo(stu1.getName());
        throw new ClassCastException();
    }
}
