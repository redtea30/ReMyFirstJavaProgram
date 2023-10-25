package threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Package-name: threadTest
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 20/10/2023-10-2023 15-52
 * Describe：
 */

public class ThreadTest3Base {

    public static void main(String[] args) {
        FutureTask task = new FutureTask<>(new CallTest());
        Thread thread = new Thread(task);
        thread.start();
        try {
            Object o = task.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

class CallTest implements Callable {
    @Override
    public Object call() throws Exception {
        return "CALL 方法";
    }
}


