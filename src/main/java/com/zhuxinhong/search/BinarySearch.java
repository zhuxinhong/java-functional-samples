package com.zhuxinhong.search;

/**
 * Created by zhuxh on 16/5/30.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 11};

        int num = 13;

        int start = 0, end = a.length - 1;

        int index = 0;
        while (start <= end) {
            int k = (start + end) >> 1;

            if (a[k] > num)
                start = start + 1;
            else if (a[k] < num)
                end = end - 1;
            else if (a[k] == num)
                index = k;
        }

        System.out.println(index);

    }
}
