package Assignment;

/**
 * ClassName:RandomLetterGenerator
 * Package: Assignment
 * Description: 999随机验证码生成器
 *
 * @Author Neko
 * @Create 23/8/20237:35 pm
 * @Version 1.0
 */
public class RandomLetterGenerator {
    public static void main(String[] args) {
        String autocode = autoCode();
        System.out.println(autocode);

    }


    static String autoCode() {
        String autocode = "";
        int count = 0;
        do {
            int tier1 = (int) (Math.random() * 3 + 1);
            switch (tier1) {
                case 1 -> {
                    byte tier2 = (byte) (Math.random() * 10 + 48);
                    char letter = (char) tier2;
                    autocode += letter;
                }
                case 2 -> {
                    byte tier2 = (byte) (Math.random() * 26 + 65);
                    char letter = (char) tier2;
                    autocode += letter;
                }
                case 3 -> {
                    byte tier2 = (byte) (Math.random() * 26 + 97);
                    char letter = (char) tier2;
                    autocode += letter;
                }
            }
            count++;
        }
        while (count < 999);
        return autocode;
    }


}
