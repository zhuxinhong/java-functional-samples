package com.zhuxinhong.exception;

/**
 * Created by zhuxh on 16/5/24.
 */
public class TryCatchBlock {

    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(ret());
        test();
    }

    private static int add() {
        int i = 1;
        try {
            return i;
        } finally {
            System.out.println("finally has bean done");
            i++;
        }
    }

    private static int ret() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    private static void test() {
        try {
            func1();
        } finally {
            func2();
        }
    }

    private static int func1() {
        System.out.println("func1");
        return 1;
    }

    private static int func2() {
        System.out.println("func2");
        return 2;
    }
}
