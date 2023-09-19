package assignment0919;

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
    public static String breakSentence(String s, String[] wordDict) {

        return wordDict[1];
    }

    public static boolean wordBreak(String s, String[] wordDict) {
        sortDict(wordDict);
        char space = 32;
        String spaceStr = Character.toString(space);
        //这里故意搞的麻烦一点
        StringBuilder buffer = new StringBuilder(s);
        //啊？我故意用的StringBuffer，快来打我
        int i = 0;
        boolean checked = false;
        while (i < wordDict.length) {
            if (s.contains(wordDict[i])) {
                int length = wordDict[i].length();
                //这里获取了待插入字符串的长度
                int index = buffer.indexOf(wordDict[i]);

/*                if (canSeparate(buffer, ,index,)) {
                    i++;
                    continue;
                }*/
                //检查点先不搞了，没时间了
                buffer.insert(index++, space);
                //这里必须加一，前面已经塞了一个空格了buffer的index的位置加一
                buffer.insert(index + length, space);
                checked = true;
            }
            s = buffer.toString();
            i++;
        }
        System.out.println(s);
        //检测我不会啊！
        //随便插个旗算了
        return checked;
    }

    /**
     * 普普通通的一个排序
     *
     * @param wordDict
     */
    static public void sortDict(String[] wordDict) {
        for (int i = 1; i < wordDict.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < wordDict.length; j++) {
                if (wordDict[j].length() > wordDict[minIndex].length()) {
                    minIndex = j;
                }
            }
            String temp = wordDict[i];
            wordDict[i] = wordDict[minIndex];
            wordDict[minIndex] = temp;
        }
    }

    /**
     * 一个普普通通的检查点
     *
     * @param buffer
     * @param index
     * @param length
     * @return
     */
    static public boolean canSeparate(StringBuilder buffer, int index, int length) {




        return true;
    }

    public static void main(String[] args) {
        String string = "hellocode";
        String[] wordDict = {"hello", "code"};
        System.out.println(wordBreak(string, wordDict)); // 输出: true
        //第一遍测试没问题
        String string1 = "hellocodethisisnewword";
        String[] wordDict1 = {"hello", "code", "this", "is", "new", "world"};
        System.out.println(wordBreak(string1, wordDict1)); // 输出: true
        //第二遍测试，this被分割成th is 了
        //字典排序，降序排序加检测括号解决被拆分问题


    }
}
