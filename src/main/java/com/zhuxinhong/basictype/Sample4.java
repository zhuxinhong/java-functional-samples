package com.zhuxinhong.basictype;

import java.util.Scanner;

/**
 * Created by zhuxh on 17/1/13.
 */
public class Sample4 {

    public final static Integer LIMIT = 2000;

    public static void main(String[] args) {
        int cur = 1000;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要预定的数量:");
        while (input.hasNextInt()) {
            int order = input.nextInt();
            if (order > 0 && order + cur <= LIMIT) {
                System.out.println("成功预定:" + order + "个产品");
            } else {
                System.out.println("超额，预定失败");
            }
        }
    }
}
