package assignment0919;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Share {
    private ReentrantLock lock = new ReentrantLock();
    private Condition numberCondition = lock.newCondition();
    private Condition letterCondition = lock.newCondition();
    private static boolean flag = false;


    public void makeNum() {
        lock.lock();
        while (flag == true) {
            try {
                numberCondition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Random rand = new Random();
        int temp = rand.nextInt(100);
        System.out.println("NumThread " + temp);
        flag = true;
        letterCondition.signal();
        lock.unlock();

    }

    public void makeLetter() {
        lock.lock();
        while (flag == false) {
            try {
                letterCondition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Random rand = new Random();

        char char1 = (char) (rand.nextInt(26) + 97);
        System.out.println("LetterThread " + char1);
        flag = false;
        numberCondition.signal();
        lock.unlock();

    }


}
