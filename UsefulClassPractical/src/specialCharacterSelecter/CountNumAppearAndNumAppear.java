package specialCharacterSelecter;

/**
 * ClassName:CountNumAppearAndNumAppear
 * Package: specialCharacterSelecter
 * Description:
 *
 * @Author Neko
 * @Create 23/8/20234:05 pm
 * @Version 1.0
 */
public class CountNumAppearAndNumAppear {
    public static void main(String[] args) {
        String hello = "Hello12345world!";

        countWords(hello);
    }


    static void countWords(String word) {
        int numCount = 0, wordCount = 0;
        char[] arr = word.toCharArray();
        for (int i : arr) {
            if (i >= 97 && i <= 122 || i >= 65 && i <= 90) wordCount++;
            else if (i >= 48 && i <= 57) numCount++;
        }
        System.out.println(numCount + " number of numbers");
        System.out.println(wordCount + " number of words");

    }
}
