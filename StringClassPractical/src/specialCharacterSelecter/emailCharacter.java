package specialCharacterSelecter;

/**
 * ClassName:emailChacter
 * Package: specialCharacterSelecter
 * Description:
 *
 * @Author Neko
 * @Create 23/8/202311:28 am
 * @Version 1.0
 */
public class emailCharacter {
    public static void main(String[] args) {
        //验证用户的email是否合法: 从键盘上输入email，对emal进行验证，合法的email的条件是:必须包含“@”和“”“@”必须在“”的前面，“@”只能出现一次，不能以“@”开头:不能以“”结尾
        String email1 = "qqqqqqq@qq.com";
        String email2 = "qqqqqqqqq.com";
        String email3 = "qqqqqqqqq.com.";
        String email4 = "@qqqqq";
        String email5 = "sdfsdfsdfsd@sdfdsfsdfdsf";
        checkEmailCharacter(email1);//legal
        checkEmailCharacter(email2);//illegal
        checkEmailCharacter(email3);//illegal
        checkEmailCharacter(email4);//illegal
        checkEmailCharacter(email5);//legal


    }

    /**
     * 不完全规则，检查是否包含@
      * @param str
     */
    private static void checkEmailCharacter(String str) {
        int indexPositiveSequence = str.indexOf("@");
        int indexNegativeSequence = str.lastIndexOf("@");
        boolean isNoNull = indexPositiveSequence != -1;
        boolean onlyOneEmailCharacter = (indexPositiveSequence == indexNegativeSequence);
        boolean isStartWith = !str.startsWith("@");
        boolean isEndWith = !str.endsWith(".");
        if (onlyOneEmailCharacter
                && isStartWith
                && isEndWith
                && isNoNull
        ) {
            System.out.println("legal");
            return;
        }
        System.out.println("illegal");
    }
    private static void checkEmailCharacterFullRole(String str) {
        int indexPositiveSequence = str.indexOf("@");
        int indexNegativeSequence = str.lastIndexOf("@");
        boolean isNoNull = indexPositiveSequence != -1;
        boolean onlyOneEmailCharacter = (indexPositiveSequence == indexNegativeSequence);
        boolean isStartWith = !str.startsWith("@");
        boolean isEndWith = !str.endsWith(".");
        if (onlyOneEmailCharacter
                && isStartWith
                && isEndWith
                && isNoNull
        ) {
            System.out.println("legal");
            return;
        }
        System.out.println("illegal");
    }


}
