package Teacher;

public class Demo {
    static int a = 3;
    int b = 4;
    {
        System.out.println("Demo{}" + a); // Demo{} 4
        System.out.println("Demo{}" + b); // Demo{} 4
    }
    static {
        a ++;
        System.out.println("Demo static{}" + a);  // Demo static{} 4
    }
    public Demo() {
        System.out.println("Demo()"); // Demo()
        a();
        System.out.println("a = " + a); // a = 4
        System.out.println("b = " + b); // b = 4
    }
    public void a() {
        System.out.println("Demo a()"); // Demo a()
        System.out.println("Demo a() a = " + a); // Demo a() a = 4
        System.out.println("Demo a() b = " + b); // Demo a() b = 4
    }


    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.b);
        Demo d2 = new Demo();
        System.out.println(d2.b);
    }
}
