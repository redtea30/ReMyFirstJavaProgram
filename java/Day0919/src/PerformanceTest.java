public class PerformanceTest {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread());
            });
            thread.start();
        }
    }
}
