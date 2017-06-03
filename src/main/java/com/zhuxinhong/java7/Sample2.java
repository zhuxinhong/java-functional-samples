package com.zhuxinhong.java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by zhuxh on 17/3/23.
 */
public class Sample2 {

    //Path
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/data");
        Path word = path.resolve("word");

        List<String> lines = Files.readAllLines(word);
        lines.stream().forEach(System.out::println);

    }
}
