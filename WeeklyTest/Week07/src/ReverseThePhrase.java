import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:ReverseThePhrase
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 9/9/20239:04 am
 * @Version 1.0
 */
public class ReverseThePhrase {

    public static void main(String[] args) {
        String s = "the sky is blue";
        String s1 = "  hello world  ";
        String s2 = "a good   example";
        eraseDoubleBlankAndStrip(s);
        eraseDoubleBlankAndStrip(s1);
        eraseDoubleBlankAndStrip(s2);

    }

    /**
     * 去除双 空格 并转到下个方法
     *
     * @param str
     */
    private static void eraseDoubleBlankAndStrip(String str) {
        while (str.contains("  ")) {
            str = str.replaceAll("  ", " ");
        }

        reverseThePhrase(str);
    }

    /**
     * 检测去除空字符并倒序输出
     *
     * @param str
     */
    private static void reverseThePhrase(String str) {
        String finalOutput = "";
        String[] newStr = str.split(" ");
        ArrayList arl = new ArrayList(List.of(newStr));
        arl.remove("");

        for (int i = arl.size() - 1; i > -1; i--) {
            finalOutput += arl.get(i);
            if (i != 0) finalOutput += " ";
        }
        System.out.println(finalOutput);
    }

}
