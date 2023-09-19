package assignment0919;

import java.util.Objects;

/**
 * ClassName:Student
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20237:05 pm
 * @Version 1.0
 */
public class Student {
    private int id;
    private int score;

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && score == student.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", score=" + score +
                "}\n";
    }
}
