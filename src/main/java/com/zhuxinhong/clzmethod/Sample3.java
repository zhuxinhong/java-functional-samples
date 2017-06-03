package com.zhuxinhong.clzmethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuxh on 17/6/3.
 */
public class Sample3 {

    public static void main(String[] args) {
        List l1 = new ArrayList();
        List l2 = new ArrayList() {};
        List l3 = new ArrayList() {{}};

        System.out.println(l1.getClass() == l2.getClass());
        System.out.println(l2.getClass() == l3.getClass());
        System.out.println(l1.getClass() == l3.getClass());
    }
}
