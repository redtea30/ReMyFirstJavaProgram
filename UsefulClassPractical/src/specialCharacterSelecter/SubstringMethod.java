package specialCharacterSelecter;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * ClassName:SubstringMethod
 * Package: specialCharacterSelecter
 * Description:
 *
 * @Author Neko
 * @Create 23/8/20232:13 pm
 * @Version 1.0
 */
public class SubstringMethod {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String str2 = "test";
        String check = "Java";
        int count = countAppearTimes(str, check);
        System.out.println(count);

        System.out.println(100 + 'a' + (byte) 100 + str2 + 'a');
        System.out.println("\\\\");

        byte[] bytes = str.getBytes("utf8");
        String str3 = new String(bytes, "utf8");
        //[74, 97, 118, 97, -24, -81, -83, -24, -88, -128, -26, -104, -81, -23, -99, -94, -27, -112, -111, -27, -81, -71, -24, -79, -95, -25, -102, -124, -17, -68, -116, 74, 97, 118, 97, -24, -81, -83, -24, -88, -128, -26, -104, -81, -27, -127, -91, -27, -93, -82, -25, -102, -124, -17, -68, -116, 74, 97, 118, 97, -24, -81, -83, -24, -88, -128, -26, -104, -81, -27, -82, -119, -27, -123, -88, -25, -102, -124, -17, -68, -116, 74, 97, 118, 97, -26, -104, -81, -23, -85, -104, -26, -128, -89, -24, -125, -67, -25, -102, -124, -17, -68, -116, 74, 97, 118, 97, -24, -81, -83, -24, -88, -128, -26, -104, -81, -24, -73, -88, -27, -71, -77, -27, -113, -80, -25, -102, -124]
        //Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的
        System.out.println(Arrays.toString(bytes));
        System.out.println(str3);

    }

    static int countAppearTimes(String str, String check) {
        int count = 0;
        int nowIndex;
        int checkLength = check.length();
        do {
            nowIndex = str.indexOf(check);
            if (!(nowIndex == -1)) {
                String header = str.substring(0, nowIndex);
                String footer = str.substring(nowIndex + checkLength);
                str = header + footer;

                count++;
            }
        }
        while (nowIndex != -1);
        System.out.println(str);
        return count;

    }
}
