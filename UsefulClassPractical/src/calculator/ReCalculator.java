package calculator;

/**
 * ClassName:Recalaulator
 * Package: calculator
 * Description:
 *
 * @Author Neko
 * @Create 28/8/202311:42 am
 * @Version 1.0
 */
public class ReCalculator {
    public static void main(String[] args) {
        String str = "1+2-2*3-2/1";
        System.out.println(calculator(str));
    }

    private static int calculator(String str) {
        str = str.replaceAll(" ", "");


        while (str.contains("*") || str.contains("/")) {
            int index = str.indexOf("*");
            int index2 = str.indexOf("/");

            if (index == -1) {
                index = index2;
            } else if (index2 != -1 && index2 < index) {
                index = index2;
            }
            int left = index - 1;
            int right = index + 1;

            do {
                right++;
            } while (right < str.length() && Character.isDigit(str.charAt(right)));
            do {
                left--;
            } while (left >= 0 && Character.isDigit(str.charAt(left)));
            int leftNum = Integer.parseInt(str.substring(left + 1, index));
            int rigthNum = Integer.parseInt(str.substring(index + 1, right));

            int temp = 0;
            if (str.charAt(index) == '*') {
                temp = leftNum * rigthNum;
            } else {
                temp = leftNum / rigthNum;
            }
            str = str.substring(0, left + 1) + temp + str.substring(right);
        }

        while (str.contains("+") || str.indexOf("-") != -1) {
            int index = str.indexOf("+");
            int index2 = str.indexOf("-", 1);

            if (index == -1) {
                index = index2;
            } else if (index2 != -1 && index2 < index) {
                index = index2;
            }
            if (index == -1) break;//从1位开始没有符号，就是只剩下结果-1
            int left = index - 1;
            int right = index + 1;

            do right++; while (right < str.length() && Character.isDigit(str.charAt(right)));
            do left--; while (left >= 0 && (Character.isDigit(str.charAt(left)) || str.charAt(left) == '-'));//这里需要带括号
            int leftNum = Integer.parseInt(str.substring(left + 1, index));
            int rigthNum = Integer.parseInt(str.substring(index + 1, right));

            int temp = 0;
            if (str.charAt(index) == '-') {
                temp = leftNum - rigthNum;
            } else {
                temp = leftNum + rigthNum;
            }
            str = str.substring(0, left + 1) + temp + str.substring(right);


        }


        return Integer.parseInt(str);
    }

//public static void get




















}
