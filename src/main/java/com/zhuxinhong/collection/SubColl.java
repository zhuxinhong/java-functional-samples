package com.zhuxinhong.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuxh on 17/6/11.
 */
public class SubColl {

    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("B");
        List<String> c1 = new ArrayList<>(c);
        List<String> c2 = c.subList(0, c.size());
        c2.add("C");
        System.out.println("c == c1 ? " + c.equals(c1));
        System.out.println("c == c2 ? " + c.equals(c2));
    }
}
