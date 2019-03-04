package com.zhuxinhong.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharTest {

    public Map<Character, Integer> count(String str) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] cs = str.toCharArray();
        for (char c : cs) {
            int count = 1;
            if (charMap.get(c) != null) {
                count = charMap.get(c) + 1;
            }
            charMap.put(c, count);
        }
        return charMap;
    }

    public String buildCharCount(Map<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            sb.append(map.get(key)).append(key);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CountCharTest test = new CountCharTest();
        System.out.println(test.buildCharCount(test.count("abcd")));
    }

}
