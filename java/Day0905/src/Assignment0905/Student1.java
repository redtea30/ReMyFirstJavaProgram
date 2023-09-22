package Assignment0905;

/**
 * ClassName:Student1
 * Package: Assignment0905
 * Description:
 *
 * @Author Neko
 * @Create 5/9/202310:10 pm
 * @Version 1.0
 */
public class Student1 {
    private String name;
    private double score;

    public Student1() {
    }

    public Student1(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
