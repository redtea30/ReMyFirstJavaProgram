package assignment0920;

public class AteBun implements Runnable {


    @Override
    public synchronized void run() {
        try {
            String temp = (String) BlockQueueTest.lq.take();
            Thread.sleep(20);
            System.out.println(Thread.currentThread().getName() + "吃包子" + temp);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
