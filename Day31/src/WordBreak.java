/**
 * ClassName:SeparatedBySpace
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 30/8/20237:15 pm
 * @Version 1.0
 */
public class WordBreak {
    public static boolean wordBreak(String s, String[] wordDict) {
        boolean[] list = new boolean[s.length()];
        int index = 0;
        for (int i = index; i < s.length(); i++) {
            String str = s.substring(index, i + 1);
            for (String strDict : wordDict) {
                if (str.equals(strDict)) {
                    list[i] = true;
                    index = i + 1;
                    break;
                }
            }
        }
        return list[s.length() - 1];
    }



    /*public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] list = new boolean[s.length()];
        list[0] = true;
        int index = 0;
        for (int i = index; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(index, j);
                for (String str : wordDict) {
                    if (str.equals(temp)) {
                        index = j;
                        list[j - 1] = true;
                    }
                }
            }
            if (i == s.length() - 1 && list[s.length()] == false) {
                return false;
            }
        }
        return true;
    }*/


    public static void main(String[] args) {
        String string = "aaaaaaa";
        String[] wordDict = {"aaaa", "aaa"};
        System.out.println(wordBreak(string, wordDict));

        String string1 = "hellocodethisisnewword";
        String[] wordDict1 = {"hello", "code", "this", "is", "new", "world"};
        System.out.println(wordBreak(string1, wordDict1));


    }
}
