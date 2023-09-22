public class ThreadTest {
    Long num = 1l;

    //way1给对象内部加锁
    void add() {
//        synchronized (this) {
        for (int i = 0; i < 10000000; i++) {
            num++;
        }
//        }
    }

    void minus() {
//        synchronized (this) {
        for (int i = 0; i < 10000000; i++) {
            num--;
        }
    }
//    }

}

class test {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest td = new ThreadTest();
        Thread ts = new Thread(new Runnable() {
            @Override
            public void run() {
                //way2,给要执行的对象加锁
                synchronized (td) {
                    td.add();
                }
            }
        });

        Thread ta = new Thread(() -> {
            synchronized (td) {
                td.minus();
            }
        });

        ta.setPriority(6);
        ta.start();
        ts.start();

        ta.join();
        ts.join();
        System.out.println(td.num);
    }
}
