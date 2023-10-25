package threadTest;

/**
 * Package-name: org
 * Project-name:LinkedTestProject
 * Author: Neko
 * 20/10/2023-10-2023 10-10
 * Describe：
 */

public class ThreadTest1Base {

    //最基础的Thread实现方式，新建类继承Thread然受实现
    public static void main(String[] args) {
        new MyThread().start();
        try {
            //主线程睡三秒做测试
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("主线程执行完毕");

    }
}

class MyThread extends Thread {
    @Override
    public void run() {

        try {
            //当前线程睡一秒做测试
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("线程启动");
    }
}