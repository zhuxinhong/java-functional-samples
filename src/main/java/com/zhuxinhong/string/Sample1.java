package com.zhuxinhong.string;

/**
 * Created by zhuxh on 17/6/3.
 */
public class Sample1 {

    public static void main(String[] args) {
        String str1 = "中国";
        String str2 = new String("中国");
        String str3 = str2.intern();
        System.out.println(str1 == str3);
    }
}
