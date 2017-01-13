package com.zhuxinhong.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhuxh on 16/6/2.
 */
public class ThreadsPool {

    public static void main(String[] args) throws InterruptedException {
        ThreadsPool threadsPool = new ThreadsPool();
        Exec exec = threadsPool.new Exec();

        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(exec);
            thread.setName("abcxyz--" + i);
            pool.submit(thread);
        }

        pool.awaitTermination(2l, TimeUnit.SECONDS);
        System.out.println("isTerminated() :" + pool.isTerminated());
        System.out.println("sShutdown() :" + pool.isShutdown());
        pool.shutdown();
    }


    class Exec implements Runnable {

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " -- done");
        }
    }
}


