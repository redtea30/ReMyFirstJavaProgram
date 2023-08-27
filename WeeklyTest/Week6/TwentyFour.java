package Week6;

/**
 * ClassName:TwentyFour
 * Package: Week6
 * Description:
 *
 * @Author Neko
 * @Create 27/8/20232:37 pm
 * @Version 1.0
 */
public class TwentyFour {
}

class Super {
    Super(int i) {
        System.out.println("Super" + i + ",");
    }
}

class Sub extends Super {
    static Super s1 = new Super(1);
    Super s2 = new Super(3);

    public static void main(String[] args) {
        Super c1 = new Sub(2);
    }

    Sub(int i) {
        super(i);
        System.out.println("Sub" + i + ",");
    }
}