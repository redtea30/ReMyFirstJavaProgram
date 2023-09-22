package assignment0918;

public class InterruptTask {
    static long count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //通过Thread.CurrentThread().isInterrupted()方法进行检测，当前线程收到interrupt信号后自动跳出循环
                while (!Thread.currentThread().isInterrupted()) {
                    count++;
                }
            }
        });
        thread1.start();
        Thread.sleep(5000);
        thread1.interrupt();
        System.out.println(count);


    }


}

