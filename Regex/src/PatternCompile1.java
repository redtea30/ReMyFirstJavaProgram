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
public class PatternCompile1 {
    public static void main(String[] args) {

        String line = "菜鸟教程 - 学的不仅是技术，更是梦想！";
        String regex = ".*-.*";
        Pattern test1 = Pattern.compile(regex);
        boolean result = test1.matcher(line).matches();
        System.out.println(result);

        String line2 = "asdfsadfsadfasdf123123asdlkjflsdjflas";
        String regex2 = "";




    }
}
