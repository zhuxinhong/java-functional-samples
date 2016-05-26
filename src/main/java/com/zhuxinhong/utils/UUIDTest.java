package com.zhuxinhong.utils;

import java.util.UUID;

/**
 * Created by zhuxh on 16/3/17.
 */
public class UUIDTest {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
        System.out.println(uuid.toString().length());
    }
}
