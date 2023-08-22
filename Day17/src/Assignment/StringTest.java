package Assignment;

import java.util.Arrays;

/**
 * ClassName:StringTest
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 22/8/20236:53 pm
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        int[] intArray = {12, 45, 78, 34, 67, 90, 23, 56, 89, 10};
        String randomStr = "AbcdEf";
        String randomStr1 = "AbCDefg";
        String randomStr2 = "abcdef";
        String randomStr3 = "A";
        String randomStr4 = "B";


        System.out.println("charAt");
        System.out.println(randomStr.charAt(1));
        //返回char字符

        System.out.println("compareTo");
        System.out.println(randomStr1.compareTo(randomStr));//-32
        System.out.println(randomStr.compareTo(randomStr2));//-32
        System.out.println(randomStr.compareTo(randomStr3));//5
        System.out.println(randomStr3.compareTo(randomStr));//5
        System.out.println(randomStr3.compareTo(randomStr4));//-1
        //返回比较到不同的时候的两个char类型的差值，两个Unicode值相减
        //基本等于前面的Unicode值减去后面的Unicode值
        //this.charAt(k)-anotherString.charAt(k)
        //如果参数字符串等于该字符串，则返回0；如果该字符串按字典顺序小于字符串参数，则小于0的数；如果该字符串按字典顺序大于字符串参数，则返回一个大于0的值。
        //compareTo

        System.out.println("compareToIgnoreCase");
        System.out.println(randomStr1.compareToIgnoreCase(randomStr));//1
        System.out.println(randomStr.compareToIgnoreCase(randomStr2));//0
        System.out.println(randomStr.compareToIgnoreCase(randomStr3));//5
        System.out.println(randomStr3.compareToIgnoreCase(randomStr));//-5
        //同上，忽略大小写
        //compareToIgnoreCase

        System.out.println("concat");
        String str1 = randomStr.concat(randomStr);
        System.out.println(str1);
        //拼接字符串

        System.out.println("contains");
        //String randomStr = "AbcdEf";
        System.out.println(randomStr.contains("abc"));//false
        System.out.println(randomStr.contains("Abc"));//true
        System.out.println(randomStr.contains("A"));//true
        //contains


        System.out.println("copyValueOf");
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char char1 = 'a';//97
        String str2 = String.copyValueOf(charArray);
        System.out.println(str2);//abcdefghij

        String str3 = String.copyValueOf(charArray, 8, 1);//i

        // offset: 距离，count： 位数
        System.out.println(str3);

        System.out.println("endWith");
        System.out.println(randomStr.endsWith("f"));//true
        System.out.println(randomStr.endsWith("Ef"));//true
        //从尾部进行匹配


        //String randomStr3 = "A";
        //String randomStr4 = "B";
        String randomStr5 = "B";
        Object obj = "B";
        String randomStr6 = "b";
        System.out.println("equals");
        System.out.println(randomStr4.equals(randomStr5));//true
        System.out.println(randomStr4.equals(randomStr));//false
        //与字符串类型进行比较
        System.out.println(randomStr4.equals(obj));//true
        //与object类型进行比较
        System.out.println(randomStr5.equalsIgnoreCase(randomStr6));//true

        System.out.println("format");
        String randomStr7 = "AbcdEf";
        String randomStr8 = "AbCDefg";
        String str4 = String.format("%s 这是一段测试代码 %s", "test", "test");
        System.out.println(str4);//test这是一段测试代码 test


        String str5 = randomStr.formatted("%s");
        System.out.println(str5);
        //有空再看，通过后面的argument对前面的str进行调整

        System.out.println("getBytes");
        byte[] char2 = randomStr.getBytes();//AbcdEf
        System.out.println(Arrays.toString(char2));//[65, 98, 99, 100, 69, 102]
        //getBytes返回String中每一个字符的Unicode值，byte类型


        System.out.println("charSet");
        String str6 = "Ā�a";//256,65533,97
        byte[] char3 = str6.getBytes();
        System.out.println(Arrays.toString(char3));//[-60, -128, -17, -65, -67, 97]
        //
        //前面两位按照规则往后排
        //a 97
        //就是个简单的转化

//        if (cs == UTF_8.INSTANCE) {
//            return encodeUTF8(coder, val, true);
//        }
//        if (cs == ISO_8859_1.INSTANCE) {
//            return encode8859_1(coder, val);
//        }
//        if (cs == US_ASCII.INSTANCE) {
//            return encodeASCII(coder, val);
//        }

        char[] char4 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        char[] char5 = new char[10];
        randomStr1.getChars(0, randomStr1.length(), char5, 0);
        //[A, b, C, D, e, f, g,  ,  ,  ]
        System.out.println(Arrays.toString(char5));

        System.out.println("hashCode");
        System.out.println(randomStr1.hashCode());//427855940
//    public static int hashCode(byte[] value) {
//        int h = 0;
//        for (byte v : value) {
//            h = 31 * h + (v & 0xff);
//        }
//        return h;
//    }
        System.out.println("indent");
        System.out.println(randomStr1.indent(5));//     AbCDefg


        System.out.println("indexOf");
        System.out.println(randomStr1.indexOf("e"));//4
        String str8 = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(str8.indexOf("a", 20));//-1
        //formIndex 表示从第几位开始找，跳过的或者不存在返回-1

        String str9 = "1     0";
        String str10 = "";
        String str11 = " ";
        System.out.println(str9.isBlank());//fasle
        System.out.println(str10.isBlank());//true
        System.out.println(str11.isBlank());//true
        //当前字符串只包含空格或者null的时候返回true

        System.out.println("lastIndexOf");
        String str12 = "qqqqeeeewwww";//12位
        System.out.println(str12.lastIndexOf("w"));//11
        //最后一次出现该字符串的位置

        System.out.println(str12.lastIndexOf("w", 2));//-1
        //从给定序号往前搜索，找不到返回-1


        System.out.println("matches");
        System.out.println("regular expression");
        System.out.println(str12.matches(""));
        //正则表达式先跳过
        //妈的，有时间再瞅下








    }
}
