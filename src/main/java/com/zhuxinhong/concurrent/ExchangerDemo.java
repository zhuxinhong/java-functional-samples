package com.zhuxinhong.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhuxh on 17/3/8.
 */
public class ExchangerDemo {

    private static final Exchanger<String> exgr = new Exchanger<>();

    private static ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                String a = "银行流水A";
                try {
                    exgr.exchange(a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                String aa = "我是TEST";
                try {
                    exgr.exchange(aa);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                String b = "银行流水B";
                try {
                    String a = exgr.exchange("B");
                    System.out.println(a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        System.exit(0);

    }



}
