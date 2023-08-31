/**
 * ClassName:ExceptionTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 31/8/20232:01 pm
 * @Version 1.0
 */
public class ExceptionTest {
    public static void main(String[] args) {

        try {
            exception3();
        } catch (Exception e2) {
            System.out.println(e2.getMessage());

            Throwable e3 = e2.getCause();
            System.out.println(e3.getMessage());

            Throwable e4 = e3.getCause();
            System.out.println(e4.getMessage());
        }

    }


    /**
     * 创建一个起始异常，异常类型自定义
     *
     * @throws exception_test01
     */
    public static void exception1() throws exception_test01 {
        //System.out.println("this is exception1");
        throw new exception_test01("this is exception1");
    }

    /**
     * @throws Exception
     */
    public static void exception2() throws Exception {
        try {
            exception1();
        } catch (Exception e) {
            //System.out.println("this is exception2");
            System.out.println(e.getMessage());
            //e.getMessage();调用上一句的异常信息
            throw new Exception("this is exception2", e);
            //这里的e就是上一个异常
            //当前异常在下个方法中命名
        }


    }

    public static void exception3() throws Exception {
        try {
            exception2();
        } catch (Exception e1) {
            //System.out.println("this is exception3");
            System.out.println(e1.getMessage());
            Exception e2 = new Exception("this is exception3");
            throw e2;

        }


    }


}

class exception_test01 extends Exception {
    public exception_test01(String message) {
        super(message);
    }
}
