package assignment0918;

public class InterruptTask {
    public static void main(String[] args) throws InterruptedException {
        final long[] count = {0};
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //通过Thread.CurrentThread().isInterrupted()方法进行检测，当前线程收到interrupt信号后自动跳出循环
                while (!Thread.currentThread().isInterrupted()) {
                    count[0]++;
                    //这是减速用的
                    int i = 999 * 999999;
                    int s = 999 * 999999;
                    int d = 999 * 999999;
                    int x = 999 * 999999;
                }
            }
        });
        thread1.start();
        Thread.sleep(5000);
        thread1.interrupt();
        System.out.println(count[0]);


    }


}

