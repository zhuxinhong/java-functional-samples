package com.zhuxinhong.threads;

/**
 * Created by zhuxh on 16/5/29.
 */
public class AlternateThread {

    private static final Object LOCK = new Object();

    static Info info = new Info();

    static boolean flag = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (LOCK) {
                    while (info.i < info.STR.length()) {
                        if (true == flag) {
                            info.print();
                            flag = false;
                            LOCK.notify();
                        }
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (LOCK) {
                    while (info.i < info.STR.length()) {
                        if (false == flag) {
                            info.print();
                            flag = true;
                            LOCK.notify();
                        }
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

}

class Info {

    static final String STR = "HELLOWORLD";

    int i;

    public void print() {
        if (i < STR.length()) {
            System.out.println(Thread.currentThread().getName() + STR.charAt(i));
            i++;
        }
    }
}