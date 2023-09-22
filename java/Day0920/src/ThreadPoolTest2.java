import java.util.concurrent.*;

public class ThreadPoolTest2 {
    public static void main(String[] args) {
        ThreadPoolExecutor te = new ThreadPoolExecutor(3, 5, 1, TimeUnit.SECONDS, new SynchronousQueue<>());


        Future<String> s1 = te.submit(new myCallable(5));
        Future<String> s2 = te.submit(new myCallable(10));
        Future<String> s3 = te.submit(new myCallable(100));
        Future<String> s4 = te.submit(new myCallable(1000));

        try {
            System.out.println(s1.get());
            System.out.println(s2.get());
            System.out.println(s3.get());
            System.out.println(s4.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        te.shutdown();


    }
}

class myCallable implements Callable {
    private int num;

    //传入一个构造接受数字
    public myCallable(int num) {
        this.num = num;
    }

    @Override
    public String call() throws Exception {
        return String.valueOf(sum(num));
    }

    private int sum(int num) {
        if (num == 1) return 1;
        return num + sum(num - 1);
    }
}
