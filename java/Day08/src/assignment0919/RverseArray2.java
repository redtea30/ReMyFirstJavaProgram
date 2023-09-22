package assignment0919;

/**
 * ClassName:RverseArray
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 9/8/20237:36 pm
 * @Version 1.0
 */
public class RverseArray2 {
    public static void main(String[] args) {
        char[][] chunxiao = {
                {'春', '眠', '不', '觉', '晓'},
                {'处', '处', '闻', '啼', '鸟'},
                {'夜', '来', '风', '雨', '声'},
                {'花', '落', '知', '多', '少'}
        };


        for (int i = 0; i < chunxiao[i].length; i++) {
            for (int j = 0; j < chunxiao.length; j++) {
                System.out.print(chunxiao[chunxiao.length - 1 - j][i]);
            }
            System.out.println();
        }

    }
}
