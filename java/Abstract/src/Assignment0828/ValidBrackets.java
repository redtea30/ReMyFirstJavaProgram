package Assignment0828;

/**
 * ClassName:ValidBrackets
 * Package: Assignment0828
 * Description:
 *
 * @Author Neko
 * @Create 28/8/20238:13 pm
 * @Version 1.0
 */
public class ValidBrackets {
    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "(]";
        System.out.println(isValidBrackets(str1));
        System.out.println(isValidBrackets(str2));

    }

    public static boolean isValidBrackets(String str) {
        int parenthesis = 0;
        int squareBracket = 0;
        int curlyBracket = 0;

        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char leftSquareBracket = '[';
        char rightSquareBracket = ']';
        char leftCurlyBracket = '{';
        char rightCurlyBracket = '}';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == leftParenthesis) parenthesis++;
            else if (str.charAt(i) == rightParenthesis) if (!(parenthesis > 0)) return false;
            else parenthesis--;
            else if (str.charAt(i) == leftSquareBracket) squareBracket++;
            else if (str.charAt(i) == rightSquareBracket) if (!(squareBracket > 0)) return false;
            else squareBracket--;
            else if (str.charAt(i) == leftCurlyBracket) curlyBracket++;
            else if (str.charAt(i) == rightCurlyBracket) if (!(curlyBracket > 0)) return false;
            else curlyBracket--;
        }
        return parenthesis == 0 && squareBracket == 0 && curlyBracket == 0;
    }
}
