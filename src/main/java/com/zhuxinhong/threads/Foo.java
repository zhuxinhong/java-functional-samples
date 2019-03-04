package com.zhuxinhong.threads;

/**
 * Created by zhuxh on 17/6/12.
 */
public class Foo implements Runnable {

    @Override
    public void run() {
        fun(10);
    }

    public synchronized void fun(int i) {
        if (--i > 0) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(i);
            fun(i);
        }
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.run();
            }
        });
        t.start();
    }

}

