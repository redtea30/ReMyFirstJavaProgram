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
    private Student[] stu;

    public Student() {
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
        stu = new Student[10];
        stu[1] = new Student("Student1", 1);
        stu[2] = new Student("Student1", 1);
        stu[3] = new Student("Student1", 1);
        stu[4] = new Student("Student1", 1);
        stu[5] = new Student("Student1", 1);
        stu[6] = new Student("Student1", 1);
        stu[7] = new Student("Student1", 1);
        stu[8] = new Student("Student1", 1);
        stu[9] = new Student("Student1", 1);
        stu[10] = new Student("Student1", 1);

    }
}

class test {

    public static void main(String[] args) {
        Student student1 = new Student();
        sort(student1.getStu(), 0, student1.getStu().length);

    }

    public static void sort(Student[] stu, int start, int end) {
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int pivot = stu[start].getAge();

        while (left < right) {
            while (left < right && stu[right].getAge() >= pivot) {
                right--;
            }
            while (left < right && stu[left].getAge() <= pivot) {
                left--;
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