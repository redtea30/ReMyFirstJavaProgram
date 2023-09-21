import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3, 5, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
        //后面对这个数组的里的线程池元素进行检测
        List<ThreadPoolExecutor> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            tpe.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread());
                }
            });
            list.add(tpe);
        }

        //线程池和线程不一样，只需要关闭线程池就行
        tpe.shutdown();
        //这个循环检测下有没有完全关闭
        for (ThreadPoolExecutor i : list) {
            System.out.println(i.isShutdown());
        }
    }
}
