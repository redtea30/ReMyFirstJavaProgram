import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HowToMakeAThreadPractical {
    @Test
    void test1() {
        //way1ToMakeAThread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    @Test
    void test2() {
        //way2ToMakeAThread
        Thread thread = new Thread() {
            @Override
            public void run() {

            }
        };
    }

    @Test
    void test3() {
        //way3ToMakeAThread
        Thread thread = new Thread(new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        }));
    }

    public static void main(String[] args) {


    }


}

class test2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 900000; i++) {
            System.out.println(i);
        }

        return null;
    }
}

class myTask {

    public static void main(String[] args) throws InterruptedException {
        FutureTask ft = new FutureTask<>(new test2());
        FutureTask ft1 = new FutureTask<>(new test2());
        FutureTask ft2 = new FutureTask<>(new test2());
        FutureTask ft3 = new FutureTask<>(new test2());
        FutureTask ft4 = new FutureTask<>(new test2());

        Long current = System.currentTimeMillis();
        Thread thread = new Thread(ft);
        thread.start();

        Thread thread1 = new Thread(ft1);
        thread1.start();

        Thread thread2 = new Thread(ft2);
        thread2.start();


        Thread thread3 = new Thread(ft3);
        thread3.start();


        Thread thread4 = new Thread(ft4);
        thread4.start();


        System.out.println(System.currentTimeMillis() - current + "秒");
    }
}

class Call2 implements Callable {

    @Override
    public Object call() throws Exception {
        long i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            i++;
        }
        return i;
    }
}

class myTask2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask ft = new FutureTask(new Call2());
        Thread thread = new Thread(ft);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
        long temp = (long) ft.get();
        System.out.println(temp);
    }
}