package Assignment;

/**
 * ClassName:Suffix
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 23/8/20238:32 pm
 * @Version 1.0
 */
public class SetSuffix {
    public static void main(String[] args) {

        String test = "asdfghjgfdssfgsadsfg.junit";
        String test1 = "asdfghjkjhgfdfssdfdgfhgjasdfghfds.rar";

        System.out.println(suffix(test));
        System.out.println(suffix(test1));

    }

    static String suffix(String str) {

        int getIndex = str.lastIndexOf(".");
        String suffix = str.substring(getIndex);
        return suffix;

    }
}
