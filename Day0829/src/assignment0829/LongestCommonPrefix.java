package assignment0829;

/**
 * ClassName:LongestCommonPrefix
 * Package: assignment0829
 * Description:
 *
 * @Author Neko
 * @Create 29/8/20238:42 pm
 * @Version 1.0
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] testArr = {
                "flower",
                "flow",
                "flight"};
        System.out.println(getLCP(testArr));
        String[] testArr1 = {
                "flower",
                "flow",
                "flight",
                "flo",
                "f",
                "abc",
                ""
        };
        System.out.println(getLCP(testArr1));
        String[] testArr2 = {
                "flower",
                "flow",
                "flight",
                "floww",
                "flowww",
                "fla",
                null
        };
        System.out.println(getLCP(testArr2));

    }

    public static String getLCP(String[] arr) {
        int minLength = arr[0].length();
        String finalArr = "";
        for (String s : arr) {
            //这里添加了检测null和空字符的方法，使用isEmpty会直接报异常，还需要单独输出null
            if (s == null) return null;
            else if (s.equals("")) return finalArr;
            else if (minLength > s.length()) minLength = s.length();
        }
        if (minLength == 0) return null;
        outer:
        for (int i = 0; i < minLength; i++) {
            char temp = arr[0].charAt(i);
            for (String s : arr) {
                if (temp != s.charAt(i)) {
                    break outer;
                }
            }
            //finalArr = finalArr.concat(Character.toString(temp));
            finalArr += temp;
        }
        return finalArr;
    }
}
