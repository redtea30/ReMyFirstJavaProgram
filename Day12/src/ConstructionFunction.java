/**
 * ClassName:ConstructionFunction
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20238:23 am
 * @Version 1.0
 */
public class ConstructionFunction {

    public static void main(String[] args) {
        new ConstructionFunction(2);
        //实验构造方法能不能当普通方法用，需要new一个方法，但不需要对象？

        //function2();
        //方法不可以直接被调用
        ConstructionFunction cf = new ConstructionFunction();//后一个是构造方法的意思
        //新造了个cf对象，调用空参构造器一次，接下来调用方法
        cf.function2();

    }

    public ConstructionFunction() {
        System.out.println("function1");
    }

    public ConstructionFunction(int a) {
        new ConstructionFunction();
        System.out.println("function2");
    }

    public void function() {
        System.out.println("test1");
    }

    public void function1() {
        function();
        System.out.println("test2");
    }

    public void function2() {
        function1();
        System.out.println("test3");
    }

}
