package com.zhuxinhong.java7;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by zhuxh on 17/3/23.
 */
public class Sample2 {

    //Path
    public static void main(String[] args) {
        Path path = Paths.get("/data");
        Path word = path.resolve("word");

    }
}
