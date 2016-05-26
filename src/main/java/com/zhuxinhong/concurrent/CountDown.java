package com.zhuxinhong.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhuxh on 16/5/24.
 */
public class CountDown {

    public static void main(String[] args) throws InterruptedException {

        Map<Integer, String> map = new HashMap();
        map.put(1, "a");
        map.put(2, "b");

        readdata:
        for (int i = 0; i < 10; i++){
            Set entrySet = map.entrySet();

            Iterator<Map.Entry> it = entrySet.iterator();
            while(it.hasNext()){
                Map.Entry entry = it.next();
                if((Integer)entry.getKey() == 1){
                    System.out.println("continue:" + i);
                    continue readdata;
                }
            }
            System.out.println(i);

        }
    }


}
