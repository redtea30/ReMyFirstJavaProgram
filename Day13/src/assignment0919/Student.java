package assignment0919;

/**
 * ClassName:Student
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20237:21 pm
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;
    private int studentId;
    private int score;

    public Student() {
    }

    public Student(String name, byte age, int studentId, short score) {
        this.setAge(age);
        this.setName(name);
        this.setScore(score);
        this.setStudentID(studentId);
    }

    public Student(String name) {
        this.setName(name);
    }

    public Student(short score) {
        this.setScore(score);
    }

    public Student(int studentId) {
        this.setStudentID(studentId);
    }

    public Student(byte age) {
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentID() {
        return this.studentId;
    }

    public void setStudentID(int studentID) {
        this.studentId = studentId;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
