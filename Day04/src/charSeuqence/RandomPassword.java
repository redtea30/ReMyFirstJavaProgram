package charSeuqence;

import java.util.Random;

/**
 * ClassName:RandomPassword
 * Package: charSeuqence
 * Description:
 *
 * @Author Neko
 * @Create 3/8/202310:03 am
 * @Version 1.0
 */
public class RandomPassword {
    public static void main(String[] args) {
        String password = "";
        for (int i = 0; i < 3; i++) {
            //大写字母
            int big = new Random().nextInt(26);
            big += 65;
            char pass1 = (char) big;
            //小写字母
            int small = new Random().nextInt(26);
            small += 97;
            char pass2 = (char) small;
            //大写字母
            int num = new Random().nextInt(10);
            num += 48;
            char pass3 = (char) num;
            //拼接密码


            password = password + pass1 + pass2 + pass3;//这里的password 将pass123转换为String型
        }
        System.out.println(password);

    }
}
