package Assignment;

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
