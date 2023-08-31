import java.util.Arrays;

/**
 * ClassName:Student
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 31/8/20239:21 am
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;
    private Student[] stu = new Student[10];

    public Student() {
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
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Student[] getStu() {
        return stu;
    }

    public void setStu(Student[] stu) {
        this.stu = stu;
    }

    {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stu=" + Arrays.toString(stu) +
                '}';
    }
}

class test {

    public static void main(String[] args) {

        Student student1 = new Student();
        sort(student1.getStu(), 0, student1.getStu().length-1);
        for (Student student :
                student1.getStu()) {
            System.out.println(student.toString());
        }
    }

    public static void sort(Student[] stu, int start, int end) {
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int pivot = stu[start].getAge();

        while (left < right) {
            while (left < right && stu[right].getAge() <= pivot) {
                right--;
            }
            while (left < right && stu[left].getAge() >= pivot) {
                left++;
            }
            Student temp = stu[left];
            stu[left] = stu[right];
            stu[right] = temp;
        }
        if (stu[left].getAge() < pivot) {
            Student temp = stu[left];
            stu[left] = stu[start];
            stu[start] = temp;
        }
        sort(stu, 0, left - 1);
        sort(stu, left + 1, end);


    }
}