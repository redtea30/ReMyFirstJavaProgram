package Assignment0828;

/**
 * ClassName:MaxLengthSubString
 * Package: Assignment0828
 * Description:  现在就没问题了，大概
 *
 * @Author Neko
 * @Create 28/8/20237:45 pm
 * @Version 1.0
 */
public class LongestCommonSubsequence1 {
    public static void main(String[] args) {
        String str1 = "aaaaaa";
        String str2 = "aaaaaa";
        getLCS(str1, str2);
        String str3 = "abcde";
        String str4 = "ace";
        getLCS(str3, str4);
    }

    public static void getLCS(String str1, String str2) {
        int x = str2.length();
        int y = str1.length();
        int[][] arr = new int[y + 1][x + 1];
        for (int i = 1; i < y + 1; i++) {
            for (int j = 1; i < x + 1; i++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) arr[i][j] = arr[i - 1][j - 1] + 1;
                else if (str1.charAt(i - 1) != str2.charAt(j - 1)) arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
            }
        }
        System.out.println(arr[arr.length][arr[1].length]);
    }
}
