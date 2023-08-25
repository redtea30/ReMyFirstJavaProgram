package Assignment0824;

/**
 * ClassName:DeleteRepetation
 * Package: Assignment0824
 * Description:
 *
 * @Author Neko
 * @Create 24/8/20237:49 pm
 * @Version 1.0
 */
public class DeleteRepetition {
    public static void main(String[] args) {
        String test = "可可爱爱可可爱爱可可爱爱可可爱爱可可爱爱可可爱爱可可爱爱可可爱爱可可爱爱";
        System.out.println(deleteRepetition(test));


    }

    public static String deleteRepetition(String str) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(j) == sb.charAt(i)) {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
        String result = sb.toString();
        return result;
    }
}
