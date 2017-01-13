package com.zhuxinhong.sort;

/**
 * Created by zhuxh on 16/5/30.
 * 希尔排序 不稳定排序
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
 */
public class HeerSort {

    public static void main(String[] args) {
        int a[] = {1, 54, 6, 3, 78, 34, 12, 45, 56, 100};

        double d1 = a.length;

        int temp = 0;

        while (true) {

            d1 = Math.ceil(d1 / 2);

            int d = (int) d1;

            for (int x = 0; x < d; x++) {

                for (int i = x + d; i < a.length; i += d) {

                    int j = i - d;

                    temp = a[i];

                    for (; j >= 0 && temp < a[j]; j -= d) {

                        a[j + d] = a[j];

                    }

                    a[j + d] = temp;

                }

            }

            if (d == 1)

                break;

        }

        for (int i = 0; i < a.length; i++)

            System.out.println(a[i]);

    }
}
