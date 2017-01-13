package com.zhuxinhong.basictype;

/**
 * Created by zhuxh on 17/1/13.
 */
public class Sample3 {

    public static final int LIGHT_SPEED = 30 * 10000 * 1000;

    public static void main(String[] args) {
        long dis1 = LIGHT_SPEED * 1;

        System.out.println("光1秒的距离:" + dis1);

        long dis2 = LIGHT_SPEED * 60 * 8;

        System.out.println("光8分钟的距离:" + dis2);
    }
}
