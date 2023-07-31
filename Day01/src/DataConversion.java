import org.junit.jupiter.api.Test;

/**
 * ClassName:DataConversion
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 31/7/20234:04 pm
 * @Version 1.0
 */


public class DataConversion {

    @Test
    public void test1() {
        //auto-conversion
        byte data = 12;
        short data1 = data;
        int data2 = data1;
        long data3 = data2;
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
/*        12
        12
        12
        12*/
    }

    @Test
    public void test2() {
        long data1 = 2100000000000L;
        short data2 = (short) data1;
        int data3 = (int) data2;
        byte data4 = (byte) data3;
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
    }

    @Test
    public void test3() {


    }


}