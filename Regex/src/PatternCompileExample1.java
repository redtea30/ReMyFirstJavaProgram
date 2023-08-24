import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName:test1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 24/8/20232:10 pm
 * @Version 1.0
 */
public class PatternCompileExample1 {
    public static void main(String[] args) {

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));// \D为非数字字符 * 0次或多次匹配
            System.out.println("Found value: " + m.group(2));// \d为非数字字符匹配 + 一次或多次匹配
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
