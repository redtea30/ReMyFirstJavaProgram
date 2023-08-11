import java.util.Random;

/**
 * ClassName:Tree
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 11/8/202311:10 am
 * @Version 1.0
 */
public class Tree {
    static long grow = 11; // 树初始成长值，当成长值 归零或小于0时，树死亡
    static long warms = 0;

    public static void main(String[] args) throws InterruptedException {
        // 获取操作次数
        // 生成随机数
        Random rand = new Random();
        //int type = rand.nextInt(4) + 1; //【1，4】
        // 分支 按照type执行不同的方法
        long count = 0;
        while (grow >= 0) {
            count++;
            int type = rand.nextInt(4) + 1; //【1，4】
            switch (type) {
                case 1 -> {
                    water();
                    break;
                }
                case 2 -> {
                    cut();
                    break;
                }
                case 3 -> {
                    fertilize();
                    break;
                }
                case 4 -> {
                    worms();
                    break;
                }
            }
            System.out.println("第" + count + "轮 "+(grow>=0?"存活":"死亡"));

        }


    }

    /**
     * 浇水，每浇一次水成长值 +10
     */
    public static void water() {
        grow += 10;
        System.out.println("浇水 余额" + grow);
    }

    /**
     * 修剪树，每修剪一次成长值 +5
     */
    public static void cut() {
        grow += 5;
        System.out.println("修剪 余额" + grow);
    }

    /**
     * 打药，每打药一次成长值 +20
     */
    public static void fertilize() {
        grow += 5;
        System.out.println("打药 余额" + grow);
    }

    /**
     * 生虫，每生虫一次成长值 -10
     * 连续生虫三次，生长值额外 - 20
     */
    public static void worms() {
        warms++;
        if (warms % 3 == 0) {
            grow -= 30;
            System.out.println("生虫三次 余额" + grow);
        } else {
            grow -= 10;
            System.out.println("生虫 余额" + grow);
        }
    }
}
