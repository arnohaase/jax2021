package com.ajjpj.javaworkshop.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class ReaderWriterTransfer {
    public static void main(String[] args) throws Exception {
        try(FileReader r = new FileReader("src/main/resources/beispieltext-utf8.txt", StandardCharsets.UTF_8);
                FileWriter w = new FileWriter("output.txt", StandardCharsets.UTF_8)
        ) {
            r.transferTo(w);
        }
    }
}
