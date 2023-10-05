package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

    }


}


class myCallable implements Callable<String> {

    /**
     * 直接继承Callable接口
     *
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        myCallable myCallable = new myCallable();
        FutureTask<String> stringFutureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(stringFutureTask);
        thread.start();
        System.out.println(stringFutureTask.get());

    }

    @Override
    public String call() throws Exception {
        return Thread.currentThread().toString();
    }

}


class PrintOddEven {
    public static void main(String[] args) {

        test2();
    }


    /**
     * 普普通通Thread线程
     */
    public static void test1() {
        Thread even = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                if (i % 2 == 0) System.out.println(Thread.currentThread().toString() + i);
            }
        });
        Thread odd = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                if (i % 2 != 0) System.out.println(Thread.currentThread().toString() + i);
            }
        });
        odd.start();
        even.start();
    }

    /**
     * interrupt方法测试
     */
    public static void test2() {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                i++;
                if (Thread.interrupted()) {
                    System.out.println("线程结束");
                    System.out.println(i);
                    break;
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }


}