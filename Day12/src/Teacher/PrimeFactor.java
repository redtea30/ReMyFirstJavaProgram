package Teacher;

/**
 * ClassName:PrimeFactor
 * Package: Teacher
 * Description:
 *
 * @Author Neko
 * @Create 15/8/202310:43 am
 * @Version 1.0
 */
public class PrimeFactor {
    public static void main(String[] args) {
        // 分解质因数   15 = 3 * 5    20 = 2 * 2 * 5  20 / 2 = 10 / 2 = 5
        // 1. 找到所有的因数
        // 2. 找到质因数
        // 3. 数组存储所有的质因数
        fenJiePrime(2);
//        System.out.println(new Random().nextInt(39) + 1);
    }

    public static void fenJiePrime(int num) {
        System.out.print(num + " = ");
        // 如果是质数直接输出
        if (isPrime(num)) {
            System.out.print(num);
            return;
        }
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                if (num / i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " * ");
                }
                num = num / i;
            }
        }
    }

    /**
     * 判断一个数字是否是质数
     *
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        int count = 0;
        // 除了 1 之外能整除的数量
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            if (count == 2) {
                return false;
            }
        }
        return count == 1;
    }
}
