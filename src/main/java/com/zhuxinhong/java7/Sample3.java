package com.zhuxinhong.java7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhuxh on 17/3/23.
 */
public class Sample3 {

    //Files
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/data", "word");

        createDir();
    }


    private static void readBytes(Path path) throws IOException {
        byte[] bytes = Files.readAllBytes(path);
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(content);
    }

    private static void readLines(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);
    }

    private static void write(Path path) throws IOException {
        Files.write(path, "content".getBytes(StandardCharsets.UTF_8));
    }

    private static void writeLines(Path path) throws IOException {
        List<String> lines = Arrays.asList("abc", "xyz");
        Files.write(path, lines);
    }

    private static void writeAppendLines(Path path) throws IOException {
        List<String> lines = Arrays.asList("abc", "xyz");
        Files.write(path, lines, StandardOpenOption.APPEND);
    }

    private static void createDir() throws IOException {
        Path path = Paths.get("/data", "test");
        Files.createDirectories(path);
    }

}
