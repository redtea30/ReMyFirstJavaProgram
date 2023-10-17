package com.myServletTest;

public class GetString {
    public static void main(String[] args) {
        String str = "[123jgklgkj]";
        GetString result = new GetString();
        String string = result.getString(str);
        System.out.println(string);
    }

    /**
     * 用来切字符串的工具类，差点忘了，先练练手
     *
     * @param str
     * @return
     */
    public String getString(String str) {
        String substring = str.substring(1, str.length() - 1);
        return substring;
    }
}
