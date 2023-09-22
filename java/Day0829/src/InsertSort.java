import java.util.Arrays;

/**
 * ClassName:InsertSort
 * Package: day0829
 * Description: 倒序插入排序，仅作为演示
 *
 * @Author Neko
 * @Create 29/8/20239:22 am
 * @Version 1.0
 */
public class InsertSort {
    public static void main(String[] args) {

        People[] pp = new People[]{
                new People("ligui", 21),
                new People("james", 89),
                new People("andro", 77)};
        insertSort(pp);
        System.out.println(Arrays.toString(pp));

    }

    static void insertSort(People[] pp) {
        for (int i = 0; i < pp.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < pp.length; j++) {
                if (pp[j].age > pp[maxIndex].age) {
                    maxIndex = j;
                }
            }
            People temp = pp[maxIndex];
            pp[maxIndex] = pp[i];
            pp[i] = temp;
        }
    }
}

class People {
    String name;
    int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}