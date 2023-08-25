package Assignment0824;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName:Calculator
 * Package: Assignment0824
 * Description:
 *
 * @Author Neko
 * @Create 24/8/20239:11 pm
 * @Version 1.0
 */
public class CalculatorVersion2 {
    public static void main(String[] args) {
        String str = "1+2*3-4/2";
        System.out.println(calculate(str));

    }

    public static double calculate(String str) {
        //想法：从左向右找，先找乘除，再找加减，
        //找运算符左边的边界和右边的边界
        //进行运算，然后塞回去
        //接着循环

        boolean computeSign = true;
        String regexPlus = "\\d* \\+ \\d*";
        String regexMinus = "\\d* \\- \\d*";
        String regexMultiply = "\\d* \\* \\d*";
        String regexDivide = "\\d* \\/ \\d*";
        while (computeSign) {
            Pattern checkMultiply = Pattern.compile(regexMultiply);
            Matcher matcher = checkMultiply.matcher(str);
            int index = str.indexOf("*");//运算符下标
            char operator = str.charAt(index);
            int left = findLeft(str, index - 1);
            int right = findRight(str, index + 1);
            String leftNumber = str.substring(left, index);
            String RightNumber = str.substring(index + 1, right + 1);
            String result = numToString(calculate(leftNumber, RightNumber, operator));
            //替回去
            String temp = str.substring(left, right + 1);//切下来的待替换块
            str = str.replace(temp, result);//
            computeSign = operatorExists(str, index);//先判断下个循环能不能进行
        }
        computeSign = true;
        while (computeSign) {
            Pattern checkDivide = Pattern.compile(regexDivide);
            Matcher matcher = checkDivide.matcher(str);
            int index = str.indexOf("/");//运算符下标
            char operator = str.charAt(index);
            int left = findLeft(str, index - 1);
            int right = findRight(str, index + 1);
            String leftNumber = str.substring(left, index);
            String RightNumber = str.substring(index + 1, right + 1);
            String result = numToString(calculate(leftNumber, RightNumber, operator));
            //替回去
            String temp = str.substring(left, right + 1);//切下来的待替换块
            str = str.replace(temp, result);//
            computeSign = operatorExists(str, index);//先判断下个循环能不能进行
        }
        computeSign = true;
        while (computeSign) {
            Pattern checkPlus = Pattern.compile(regexPlus);
            Matcher matcher = checkPlus.matcher(str);
            int index = str.indexOf("+");//运算符下标
            char operator = str.charAt(index);
            int left = findLeft(str, index - 1);
            int right = findRight(str, index + 1);
            String leftNumber = str.substring(left, index);
            String RightNumber = str.substring(index + 1, right + 1);
            String result = numToString(calculate(leftNumber, RightNumber, operator));
            //替回去
            String temp = str.substring(left, right + 1);//切下来的待替换块
            str = str.replace(temp, result);//
            computeSign = operatorExists(str, index);//先判断下个循环能不能进行
        }
        computeSign = true;
        while (computeSign) {
            Pattern checkMinus = Pattern.compile(regexMinus);
            Matcher matcher = checkMinus.matcher(str);
            int index = str.indexOf("-");//运算符下标
            char operator = str.charAt(index);
            int left = findLeft(str, index - 1);
            int right = findRight(str, index + 1);
            String leftNumber = str.substring(left, index);
            String RightNumber = str.substring(index + 1, right + 1);
            String result = numToString(calculate(leftNumber, RightNumber, operator));
            //替回去
            String temp = str.substring(left, right + 1);//切下来的待替换块
            str = str.replace(temp, result);//
            computeSign = operatorExists(str, index);//先判断下个循环能不能进行
        }


        Double resultFinal = Double.parseDouble(str);
        return resultFinal;
    }


    public static int findLeft(String str, int index) {
        int leftIndex;
        for (int i = index - 1; i >= 0; i--) {
            char char1 = str.charAt(i);
            boolean isTrue = char1 == 42 || char1 == 43 || char1 == 45 || char1 == 47;
            if (isTrue) {
                return i + 1;
            }
        }
        return 0;
    }

    public static int findRight(String str, int index) {
        int rightIndex;
        for (int i = index + 1; i < str.length(); i++) {
            char char1 = str.charAt(i);
            boolean isTrue = char1 == 42 || char1 == 43 || char1 == 45 || char1 == 47;
            if (isTrue) {
                return i - 1;
            }
        }
        return str.length() - 1;
    }

    public static double calculate(String str1, String str2, char operator) {
        double finalValue = 0;
        if (operator == '*') {
            finalValue = Double.parseDouble(str1) * Double.parseDouble(str2);
        } else if (operator == '/') {
            finalValue = Double.parseDouble(str1) / Double.parseDouble(str2);
        } else if (operator == '+') {
            finalValue = Double.parseDouble(str1) + Double.parseDouble(str2);
        } else if (operator == '-') {
            finalValue = Double.parseDouble(str1) - Double.parseDouble(str2);
        }
        return finalValue;

    }

    public static String numToString(double value) {
        String result = String.valueOf(value);
        return result;
    }

    public static boolean operatorExists(String str, int operatorIndex) {
        int finalValue = str.indexOf(operatorIndex);
        if (finalValue > 0) return true;
        else return false;
    }

}
