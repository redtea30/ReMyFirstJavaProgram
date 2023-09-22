public class MyThread extends Thread {
    public static void main(String[] args) {
        //三种开启线程的方式
        Thread thread = new MyThread();
        thread.start();
        System.out.println("main start");
        for (int i = 0; i < 100; i++) {
            System.out.println("main " + i);
        }
        System.out.println("main end");


    }


    @Override
    public void run() {
        System.out.println("thread start");
        for (int i = 0; i < 100; i++) {
            System.out.println("thread " + i);
        }
        System.out.println("thread end");
    }

    public static void way02() {


    }


}

class AnotherThread implements Runnable {
    @Override
    public void run() {

    }
}

