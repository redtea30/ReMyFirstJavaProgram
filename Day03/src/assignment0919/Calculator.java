package assignment0919;

import java.util.Scanner;

/**
 * ClassName:Calculator
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20235:13 pm
 * @Version 1.0
 */
public class Calculator {
    public static void main(String[] args) {
        //编写一个简单的计算器程序，要求用户输入两个数和操作符（+、-、*、/），然后根据操作符进行相应的运算，并输出结果。如果输入的运算符不是有效的运算符，则输出"无效的运算符"。

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = scanner.nextInt();
        System.out.println("请输入一个运算符（+-*/）");
        String operator = scanner.next();

        double result = 0;
        boolean flag = true;
         switch (operator) {
            case "+": {
                result = num1 + num2;
                break;
            }
            case "-": {
                result = num1 - num2;
                break;
            }
            case "*": {
                result = num1 * num2;
                break;
            }
            case "/": {
                result = num1 / num2;
                break;
            }
            default:
                flag = false;
        }


        if (flag==false){
            System.out.println("你输入的有误");
        }else{
            System.out.println(result);
        }

    }
}
