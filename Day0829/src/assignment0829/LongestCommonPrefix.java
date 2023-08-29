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


    }

    public static String getLCP(String[] arr) {
        int minLength = arr[0].length();
        String finalArr = "";
        for (int i = 0; i < arr.length; i++) {
            if (minLength > arr[i].length()) {
                minLength = arr[i].length();
            }
        }

        outer:
        for (int i = 0; i < minLength; i++) {
            char temp = arr[0].charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if (temp != arr[j].charAt(i)) {
                    break outer;
                }
            }
            //finalArr = finalArr.concat(Character.toString(temp));
            finalArr += temp;
        }
        return finalArr;
    }
}
