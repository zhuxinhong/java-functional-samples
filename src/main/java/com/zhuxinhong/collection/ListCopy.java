package com.zhuxinhong.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhuxh on 16/10/26.
 */
public class ListCopy {

    public static void main(String[] args) {
        Person a = new Person("张三", 1);
        Person b = new Person("李四", 2);

        List src = new ArrayList<>();
        src.add(a);
        src.add(b);

        List dest = Collections.nCopies(2, a);
        dest.forEach(System.out::println);
    }
}
