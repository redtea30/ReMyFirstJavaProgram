import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsMethods {
    public static void main(String[] args) {
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        ExecutorService schedule = Executors.newScheduledThreadPool(2);

        cachedPool.submit(new Callable<Object>() {
            @Override
            public Integer call() throws Exception {
                return -1;
            }
        });

        //cachedPool.execute();


    }

}
