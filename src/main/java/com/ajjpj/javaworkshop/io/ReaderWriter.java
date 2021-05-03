package com.ajjpj.javaworkshop.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderWriter {
    public static void main(String[] args) throws Exception {
        try(FileReader r = new FileReader("src/main/resources/beispieltext-utf8.txt", StandardCharsets.UTF_8);
                FileWriter w = new FileWriter("output.txt", StandardCharsets.UTF_8)
//        try(InputStream is = new FileInputStream("src/main/resources/beispieltext-utf8.txt");
//                Reader r = new InputStreamReader(is, StandardCharsets.UTF_8)
        ) {
            int i;
            while ((i = r.read()) != -1) {
                char ch = (char) i;
                System.out.print(ch);

                w.write(ch);
            }
            w.flush(); // nicht nötig, aber es steht hier, um das API zu zeigen
        }
    }
}
