/**
 * ClassName:ExceptionTest1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 1/9/20238:02 pm
 * @Version 1.0
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            testThree();
        } catch (Exception e3) {
            //e3.printStackTrace();
            Throwable e2 = e3.getCause();
            Throwable e = e2.getCause();
            //System.out.println(e3.initCause(e));
        }
    }

    public static void testOne() throws MyException {
        throw new MyException("异常1");
    }

    public static void testTwo() throws Exception {
        try {
            testOne();
        } catch (Exception e) {
            throw new Exception("异常2",e);
        }
    }

    public static void testThree() throws Exception {
        try {
            testTwo();
        } catch (Exception e2) {
            throw new Exception("异常3",e2);
        }
    }
}
