package com.zhuxinhong.threads;

/**
 * Created by zhuxh on 16/5/28.
 */
public class RunnableThread {

    public static void main(String[] args) {
        int i = 10;

        Exec exec = new Exec(i);


        Thread t1 = new Thread(exec);
        Thread t2 = new Thread(exec);

        t1.start();
        t2.start();
    }

}


class Exec implements Runnable {

    public Exec(int i) {
        this.i = i;
    }

    private Integer i;

    @Override
    public void run() {
        while (i > 0) {
            System.out.println(Thread.currentThread().getName() + " -- " + i);
            i--;
        }
    }

}
