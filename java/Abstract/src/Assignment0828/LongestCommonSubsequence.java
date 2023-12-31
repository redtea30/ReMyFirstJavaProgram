package Assignment0828;

/**
 * ClassName:MaxLengthSubString
 * Package: Assignment0828
 * Description:  这个做法有问题是找最长不重复序列的
 *
 * @Author Neko
 * @Create 28/8/20237:45 pm
 * @Version 1.0
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "asdfsdaf";
        String str2 = "acsdzgfsbxdgnzdgndgnzdgndgndgnzdgncvbndzhzere";
        getLCS(str1, str2);
    }

    public static void getLCS(String str1, String str2) {
        String finalStr = "";
        for (int i = 0; i < str1.length(); i++) {
            char temp = str1.charAt(i);
            if (str2.contains(Character.toString(temp)) && !finalStr.contains(Character.toString(temp)))
                finalStr = finalStr.concat(Character.toString(temp));
        }
        System.out.println(finalStr);
    }
}
