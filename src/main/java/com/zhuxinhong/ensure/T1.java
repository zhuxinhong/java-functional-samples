package com.zhuxinhong.ensure;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class T1 {

    private static final Path path = Paths.get("/Users/zhuxh/dirty/");

    private static BigDecimal total = BigDecimal.ZERO;

    public static void main(String[] args) throws IOException {
        File dir = path.toFile();

        BigDecimal total = BigDecimal.ZERO;

        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File f : files) {
                resolve(f);
            }
        }

        System.out.println("total=" + total);
    }

    private static void resolve(File file) throws IOException {
        List<String> lines = Files.readAllLines(file.toPath());
        BigDecimal me = BigDecimal.ZERO;

        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i).replace("\"", "");
            String[] items = line.split(",");
            BigDecimal money = new BigDecimal(items[4]);
            me = me.add(money);
        }

        total = total.add(me);
        String sout = "%s--%d--%s";
        System.out
            .println(String.format(sout, file.getName().substring(0, 8), lines.size() - 1, me));
    }


}
