package assignment0907;

/**
 * ClassName:Poker
 * Package: assignment0907
 * Description:
 *
 * @Author Neko
 * @Create 7/9/20237:35 pm
 * @Version 1.0
 */
public class Poker implements Comparable {
    private String number;
    private String color;
    private int size;

    public Poker(String number, String color, int size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if (this.size == size) return -1;
        return this.size - size;
    }
}
