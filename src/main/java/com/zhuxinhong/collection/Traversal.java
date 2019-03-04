package com.zhuxinhong.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

/**
 * Created by zhuxh on 17/6/11.
 */
public class Traversal {

    public static void main(String[] args) {
        int stuNum = 80 * 10000;
        List<Integer> scores = new ArrayList<Integer>(stuNum);

        for (int i = 0; i < stuNum; i++) {
            scores.add(new Random().nextInt(150));
        }

        foreach(scores);
        get(scores);
    }

    private static void foreach(List<Integer> list) {
        Long start = System.currentTimeMillis();

        Integer sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("avg score: " + sum / list.size());

        Long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    private static void get(List<Integer> list) {
        Long start = System.currentTimeMillis();

        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("avg score: " + sum / list.size());

        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void average(List<Integer> list) {
        int sum = 0;
        if (list instanceof RandomAccess) {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
        } else {
            for (Integer i : list) {
                sum += i;
            }
        }
        System.out.println("avg score: " + sum / list.size());
    }
}
