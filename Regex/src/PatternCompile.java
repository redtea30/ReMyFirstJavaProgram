import java.util.regex.Pattern;

/**
 * ClassName:PatternCompile
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 24/8/20233:43 pm
 * @Version 1.0
 */
public class PatternCompile {
    public static void main(String[] args) {

        String line = "I am noob " +
                "from runoob.com.";
        String regex = ".*runoob.*";
        Pattern ll = Pattern.compile(regex);
        boolean ok = ll.matcher(line).matches();
        System.out.println(ok);

    }
}
