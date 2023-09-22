/**
 * ClassName:Everest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202310:59 am
 * @Version 1.0
 */
public class Everest {
    public static void main(String[] args) {
        //需求:世界最高山峰珠穆朗玛峰高度是: 8848.86米=8848860毫米，假如我有一张足够大的它的厚度是0.1毫米。请问: 该纸张折叠多少次，可以折成珠穆朗玛峰的高度?
        //0.1*2*2*2*2
        double everset = 8848.86;
        double h = (0.1 / 1000);
        int count = 0;
        while (h < everset) {
            h *= 2;
            count++;

        }
        System.out.println(count);

    }
}
