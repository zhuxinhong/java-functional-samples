package com.zhuxinhong.threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhuxh on 17/6/12.
 */
public class Foo1 {

    public synchronized void fun1() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("fun1 done");
    }

    public synchronized void fun2() {
        System.out.println("fun2 done");
    }

    public static void main(String[] args) {
        Foo1 foo1 = new Foo1();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                foo1.fun1();
            }
        });
        t.start();
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        foo1.fun2();
    }
}
