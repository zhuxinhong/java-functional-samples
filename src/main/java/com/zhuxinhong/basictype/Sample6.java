package com.zhuxinhong.basictype;

import java.util.Random;

/**
 * Created by zhuxh on 17/1/13.
 */
public class Sample6 {

    /**种子相同 结果一致**/
    public static void main(String[] args) {
        Random r = new Random(100);
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + i + "次:" + r.nextInt());
        }
    }
}
