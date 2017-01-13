package com.zhuxinhong.basictype;

import java.util.Scanner;

/**
 * Created by zhuxh on 17/1/13.
 */
public class Sample1 {

    /**用偶判断，不用奇判断**/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入数字判断奇偶");
        while (input.hasNextInt()) {
            int i = input.nextInt();

            String str = i + " --> " + (i % 2 == 1 ? "奇数" : "偶数");
            System.out.println(str);
        }

    }
}
