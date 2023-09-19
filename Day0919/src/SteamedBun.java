import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class SteamedBun {
    //包包子，吃包子
    //一定要加延迟，不然生产的包子和吃的全部一样。狗电脑性能太强了，几乎都是一个时间戳
    private List<String> current = new ArrayList<>();
    ReentrantLock lock = new ReentrantLock();

    public synchronized void make() {
        while (current.size() == 1) {
            try {
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread());
        current.add(System.currentTimeMillis() + "");
        System.out.println("做包子" + current.get(0));

        try {
            notifyAll();
            Thread.sleep(200);
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void eat() {
        while (current.isEmpty()) {
            try {
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread());
        System.out.println("吃包子" + current.get(0));
        current.remove(0);
        notifyAll();
        try {
            Thread.sleep(200);
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

class Test1 {

    public static void main(String[] args) {
        SteamedBun sb = new SteamedBun();
        Thread cook = new Thread(() -> {
            while (true) {
                sb.make();
            }
        }, "包子大师");
        Thread cook1 = new Thread(() -> {
            while (true) {
                sb.make();
            }
        }, "包子新手");
        Thread cook2 = new Thread(() -> {
            while (true) {
                sb.make();
            }
        }, "包子专家");
        Thread eater = new Thread(() -> {
            while (true) {
                sb.eat();
            }
        }, "包子饥渴者");
        Thread eater1 = new Thread(() -> {
            while (true) {
                sb.eat();
            }
        }, "庆丰包子食客");
        cook.start();
        cook1.start();
        cook2.start();
        eater.start();
        eater1.start();


    }


}