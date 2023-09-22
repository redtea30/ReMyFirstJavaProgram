package assignment0920;

import java.util.concurrent.*;

public class BlockQueueTest {
    static LinkedBlockingQueue lq = new LinkedBlockingQueue(1);

    public static void main(String[] args) throws InterruptedException {

        //造两个线程池和一个blockqueue，不确定对不对
        ThreadPoolExecutor eat = new ThreadPoolExecutor(2, 8, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        ThreadPoolExecutor make = new ThreadPoolExecutor(2, 8, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));

        for (int i = 0; i < 100; i++) {
            eat.execute(new AteBun());
        }
        for (int i = 0; i < 100; i++) {
            make.execute(new MakeBun());
        }
        make.shutdown();
        eat.shutdown();
    }
}
