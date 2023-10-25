package threadTest;

/**
 * Package-name: threadTest
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 11-44
 * Describe：
 */

public class ThreadTest2Base {
    public static void main(String[] args) {
        System.out.println("main thread start");
        Thread thread = new Thread(new RunnableTest1());
        thread.start();
        System.out.println("main thread end");
    }
}

class RunnableTest1 implements Runnable {
    @Override
    public void run() {
        // 线程执行的任务代码
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended.");
    }
}


