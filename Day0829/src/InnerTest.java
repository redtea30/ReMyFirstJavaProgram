/**
 * ClassName:InnerTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 29/8/202310:34 am
 * @Version 1.0
 */
public class InnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();


    }
}

class Outer {
    static String name = "outer";
    String nonStaticStr = "nonStaticString";

    class Inner {
        static String name = "inner";
        String nonStaticStr = "nonStaticString";

        @Override
        public String toString() {
            return "Inner{" +
                    "nonStaticStr='" + nonStaticStr + '\'' +
                    '}';
        }
    }

    static class Inner1 {
        static String name = "inner1";
        String nonStaticStr = "nonStaticString1";

        @Override
        public String toString() {
            return "Inner1{" +
                    "nonStaticStr='" + nonStaticStr + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Outer{" +
                "nonStaticStr='" + nonStaticStr + '\'' +
                '}';
    }
}
