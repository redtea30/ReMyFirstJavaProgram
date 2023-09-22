package assignment0918;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class PrintNum {
    public static void main(String[] args) {
        //基数线程启动
        Thread thread1 = new Thread(new OddNum());
        thread1.start();
        //偶数线程启动
        FutureTask fk = new FutureTask(new EvenNum());
        Thread thread2 = new Thread(fk);
        thread2.start();

    }


}

/*生成基数
 * */class OddNum implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }
}

/*生成偶数
 * * */class EvenNum implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
        return -1;
    }
}