package com.zhuxinhong.java7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by zhuxh on 17/3/23.
 */
public class Sample1 {

    // try-with-resources
    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(Paths.get(File.separator, "data", "word"))) {
            while (in.hasNext()) {
                System.out.println(in.next());
            }
        }

        System.out.println("Well done");
    }
}
