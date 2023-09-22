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
        //调用内部非静态类
        System.out.println("NonStatic Inner Class");
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.toString());

        System.out.println("Static Inner class");
        Outer.Inner1 inner1 = new Outer.Inner1();
        System.out.println(inner1.toString());
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

        public static void main(String[] args) {
            System.out.println("调用内部类");
            Outer2 outer = new Outer2();
            System.out.println(outer.toString());



        }
    }

    @Override
    public String toString() {
        return "Outer{" +
                "nonStaticStr='" + nonStaticStr + '\'' +
                '}';
    }
}

class Outer2 {
    String name = "Outer2";
    String outer2 = "outer2";

    @Override
    public String toString() {
        return "Outer2{" +
                "name='" + name + '\'' +
                ", outer2='" + outer2 + '\'' +
                '}';
    }
}