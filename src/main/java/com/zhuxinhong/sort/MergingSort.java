package com.zhuxinhong.sort;

import java.util.Arrays;

/**
 * Created by zhuxh on 16/5/30.
 * 归并排序
 *
 1、申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列。

 2、设定两个指针，最初位置分别为两个已经排序序列的起始位置。

 3、比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置。

 4、 重复步骤3直到某一指针达到序列尾。

 5、将另一序列剩下的所有元素直接复制到合并序列尾。
 */
public class MergingSort {

    public static void main(String[] args) {
        int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void sort(int[] data, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            //对左边数组进行递归
            sort(data, left, center);
            //对右边数组进行递归
            sort(data, center + 1, right);
            //合并
            merge(data, left, center, right);
        }
    }

    public static void merge(int[] data, int left, int center, int right) {
        int[] tmpArr = new int[data.length];
        int mid = center + 1;
        //third记录中间数组的索引
        int third = left;

        int tmp = left;

        while (left <= center && mid <= right) {
            //从两个数组中取出最小的放入中间数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        //剩余部分依次放入中间数组
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }

        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        //将中间数组中的内容复制回原数组
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
        System.out.println(Arrays.toString(data));
    }
}
