package com.zhuxinhong.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhuxh on 16/5/24.
 */
public class Worker implements Runnable {

    private final CountDownLatch doneSignal;
    private int i;

    Worker(CountDownLatch doneSignal, int i) {
        this.doneSignal = doneSignal;
        this.i = i;
    }

    public void run() {
        try {
            doWork();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doneSignal.countDown();
    }

    void doWork() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println(i + " do work ...." + System.currentTimeMillis());
    }
}
