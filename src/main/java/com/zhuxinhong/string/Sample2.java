package com.zhuxinhong.string;

/**
 * Created by zhuxh on 17/6/3.
 */
public class Sample2 {

    public static void main(String[] args) {
//        plus();
        concat();
//        append();
    }

    private static void plus() {
        long start = System.currentTimeMillis();
        String str = "a";
        for (int i = 0; i < 50000; i++) {
            str += "c";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void concat() {
        long start = System.currentTimeMillis();
        String str = "a";
        for (int i = 0; i < 50000; i++) {
            str = str.concat("c");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void append() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 50000; i++) {
            sb.append("c");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
