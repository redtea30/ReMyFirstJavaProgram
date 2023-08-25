import java.util.Arrays;

/**
 * ClassName:practical
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 24/8/20235:53 pm
 * @Version 1.0
 */
public class practical {
    public static void main(String[] args) {
        //replace 返回值类型为String
        String str1 = "test";
        String str2 = "another test";
        str1 = str1.replace(str1, str2);
        System.out.println(str1);

        //split（Sting） 返回值类型为String[] 将接收的字符串作为分割字符串
        String[] strArr = str1.split(" ");
        System.out.println(Arrays.toString(strArr));

        //int num = String1.compareTo(String1);   String1比String2大返回负数，相等为0
        String str3 = "test";
        String str4 = "another test";
        int bigOrSmall = str3.compareTo(str4);
        System.out.println(bigOrSmall);
        //返回比较到不同的时候的两个char类型的差值，两个Unicode值相减
        //基本等于前面的Unicode值减去后面的Unicode值
        //this.charAt(k)-anotherString.charAt(k)
        //如果参数字符串等于该字符串，则返回0；如果该字符串按字典顺序小于字符串参数，则小于0的数；如果该字符串按字典顺序大于字符串参数，则返回一个大于0的值。





    }
}
