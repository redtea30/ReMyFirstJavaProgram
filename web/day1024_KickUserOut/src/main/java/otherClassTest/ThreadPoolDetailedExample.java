package otherClassTest;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 24-10-2023  09:15
 * Describe：
 */

public class ThreadPoolDetailedExample {

    // 核心线程数
    private static final int CORE_POOL_SIZE = 5;

    // 最大线程数
    private static final int MAX_POOL_SIZE = 10;

    // 非核心线程的超时时长
    private static final long KEEP_ALIVE_TIME = 1L;

    // 线程工厂，为新创建的线程设置名称
    private static final ThreadFactory namedThreadFactory = new ThreadFactory() {
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "MyThreadPool-Thread-" + threadNumber.getAndIncrement());
        }
    };

    public static void main(String[] args) {

        // 使用ArrayBlockingQueue作为工作队列
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(50);

        // 创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                workQueue,
                namedThreadFactory,
                new ThreadPoolExecutor.AbortPolicy() // 当队列和最大线程数都满了，拒绝策略为AbortPolicy，它将抛出RejectedExecutionException
        );

        // 提交任务
        for (int i = 0; i < 60; i++) {
            try {
                executor.execute(() -> {
                    System.out.println("线程 " + Thread.currentThread().getName() + " 正在执行");
                    try {
                        Thread.sleep(2000); // 模拟任务执行2秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            } catch (RejectedExecutionException e) {
                System.out.println("任务 " + i + " 被拒绝");
            }
        }

        // 关闭线程池
        executor.shutdown();
    }
}

