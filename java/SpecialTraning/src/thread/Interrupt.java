package thread;


//中断测试
public class Interrupt {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                i++;
                if (Thread.interrupted()) {
                    System.out.println("线程结束");
                    System.out.println(i);
                    break;
                }
            }
        });


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}
