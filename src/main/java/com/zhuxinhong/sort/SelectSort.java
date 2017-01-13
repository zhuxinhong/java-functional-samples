package com.zhuxinhong.sort;

/**
 * Created by zhuxh on 16/5/29.
 * 简单选择排序
 *  1）首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
    2）再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
    3）重复第二步，直到所有元素均排序完毕。
 */
public class SelectSort {

    public static void main(String[] args) {
        int a[] = {1, 54, 6, 3, 78, 34, 12, 45};
        int position = 0;
        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            position = i;
            int temp = a[i];
            for (; j < a.length; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }


}
