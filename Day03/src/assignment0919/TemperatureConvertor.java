package assignment0919;

import java.util.Scanner;

/**
 * ClassName:TemperatureConvertor
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 2/8/20235:21 pm
 * @Version 1.0
 */
public class TemperatureConvertor {
    public static void main(String[] args) {
        //编写一个程序，根据用户输入的温度单位("C"表示摄氏度，"F"表示华氏度)和温度，将其转换为另一种单位后输出。
        // 注: 摄氏度转换为华氏度的公式(摄氏度 * 9 / 5)+32，以及华氏度转换为摄氏度的公式(华氏度-32) * 5 / 9
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入温度 例如 13c 15f 不区分大小写");
        String temp = scanner.next();

        //to char array
        char[] charArray = temp.toCharArray();
        String unit = null;//定义温度类型
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'C' || charArray[i] == 'c') {
                unit = "celsius";
            } else if (charArray[i] == 'F' || charArray[i] == 'f') {
                unit = "fahrenheit";
            }
        }

        char[] arrcopy = new char[charArray.length - 1];
        for (int i = 0; i < charArray.length - 1; i++) {
            arrcopy[i] = charArray[i];
        }

        // 去掉单位后转成字符串
        String tempStr = new String(arrcopy);
        // 将字符串转换成整数
        int tempValue = Integer.parseInt(tempStr);


        int finalTemp = 0;
        switch (unit) {
            case "celsius": {
                finalTemp = (tempValue * 9 / 5) + 32;
                System.out.println("华氏度为" + finalTemp);
                break;
            }
            case "fahrenheit": {
                finalTemp = ((tempValue - 32) * 5 / 9);
                System.out.println("摄氏度为" + finalTemp);
                break;
            }
        }


    }
}
