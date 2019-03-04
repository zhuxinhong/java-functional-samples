package com.zhuxinhong.java7;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

/**
 * Created by zhuxh on 17/3/23.
 */
public class Sample2 {

    //Path
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/zhuxh/");
        Path file = path.resolve("export_gch.txt");

        List<String> lines = Files.readAllLines(file);

        BigDecimal total = BigDecimal.ZERO;

        int cnt = 0;

        HashSet<String> sceneSet = new HashSet<>();

        for (String line : lines) {
            String[] items = line.split("\t");

            BigDecimal money = new BigDecimal(items[6]);
            if (money.compareTo(BigDecimal.ZERO) == 0) {
                continue;
            }

            Integer businessScene = Integer.valueOf(items[1]);
            Integer businessType = Integer.valueOf(items[2]);
            Integer subsetBusinessType = Integer.valueOf(items[3]);

            String sceneKey = String
                .format("%d-%d-%d", businessScene, businessType, subsetBusinessType);
            sceneSet.add(sceneKey);


        }
//        System.out.println("===========================");
//        System.out.println(total);
//        System.out.println(cnt);

        sceneSet.forEach(System.out::println);


    }

}
