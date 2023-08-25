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
public class Calculator {
    public static void main(String[] args) {
        String str = "1+2*3-4/2";
        System.out.println(calculate(str));

    }

    public static double calculate(String str) {
        StringBuffer buffer = new StringBuffer(str);
        String regexPlus = "\\d* \\+ \\d*";
        String regexMinus = "\\d* \\- \\d*";
        String regexMultiply = "\\d* \\* \\d*";
        String regexDivide = "\\d* \\/ \\d*";
        Pattern checkMultiply = Pattern.compile(regexMultiply);
        Pattern checkDivide = Pattern.compile(regexDivide);
        Pattern checkPlus = Pattern.compile(regexPlus);
        Pattern checkMinus = Pattern.compile(regexMinus);
        int start1, start2, start3, start4;
        int end1, end2, end3, end4;
        boolean computeSign = false;
        while (computeSign) {
            computeSign = false;

            Matcher matcher1 = checkMultiply.matcher(str);
            Matcher matcher2 = checkDivide.matcher(str);
            Matcher matcher3 = checkPlus.matcher(str);
            Matcher matcher4 = checkMinus.matcher(str);
            while (matcher1.matches()) {
                start1 = matcher1.start();
                end1 = matcher1.end();
                String temp = str.substring(start1, end1);
                String[] temp1 = temp.split("\\*");
                Double temp2 = Double.valueOf(temp1[0]) * Double.valueOf(temp1[1]);
                String temp3 = temp2.toString();
                buffer = buffer.replace(start1, end1, temp3);
                computeSign = true;
            }
            while (matcher2.matches()) {
                start2 = matcher2.start();
                end2 = matcher2.end();
                String temp = str.substring(start2, end2);
                String[] temp1 = temp.split("\\/");
                Double temp2 = Double.valueOf(temp1[0]) * Double.valueOf(temp1[1]);
                String temp3 = temp2.toString();
                buffer = buffer.replace(start2, end2, temp3);
                computeSign = true;

            }
            while (matcher3.matches()) {
                start3 = matcher3.start();
                end3 = matcher3.end();
                String temp = str.substring(start3, end3);
                String[] temp1 = temp.split("\\+");
                Double temp2 = Double.valueOf(temp1[0]) * Double.valueOf(temp1[1]);
                String temp3 = temp2.toString();
                buffer = buffer.replace(start3, end3, temp3);
                computeSign = true;

            }
            while (matcher4.matches()) {
                start4 = matcher4.start();
                end4 = matcher4.end();
                String temp = str.substring(start4, end4);
                String[] temp1 = temp.split("\\-");
                Double temp2 = Double.valueOf(temp1[0]) * Double.valueOf(temp1[1]);
                String temp3 = temp2.toString();
                buffer = buffer.replace(start4, end4, temp3);
                computeSign = true;

            }


        }
        double calculateFinal = Double.parseDouble(buffer.toString());
        return calculateFinal;
    }


}
