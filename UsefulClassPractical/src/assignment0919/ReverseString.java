package assignment0919;

/**
 * ClassName:ReverseAarray
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 23/8/20238:04 pm
 * @Version 1.0
 */
public class ReverseString {
    public static void main(String[] args) {
        String testStr = "abcdefghijklmnopqrstuvwxyz";
        reverse(testStr);


    }


    /**
     * 使用concat和substring 进行拼接和截取
     *
     * @param str
     */
    static void reverse(String str) {

        String str2 = "";
        String str3 = "";

        char char1;
        String str4 = "";
        String str5 = "";
        //substring
        for (int i = str.length(); i > 0; i--) {
            str2 = str.substring(i - 1, i);
            str3 = str3.concat(str2);
            //indexOf传入的是字符串类型的数据
            //charAt可以用来获取某个字符

            //charAt
            char1 = str.charAt(i - 1);
            str5 = Character.toString(char1);
            str4 = str4.concat(str5);
        }
        System.out.println(str3);
        System.out.println(str4);
    }
}
