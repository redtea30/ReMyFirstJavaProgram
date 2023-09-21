package assignment0920;

public class MakeBun implements Runnable {
    @Override
    public synchronized void run() {
        String temp = String.valueOf(System.currentTimeMillis());
        try {
            BlockQueueTest.lq.put(temp);
            Thread.sleep(20);
            System.out.println(Thread.currentThread().getName() + "造包子" + temp);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
