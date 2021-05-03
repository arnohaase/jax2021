package com.ajjpj.javaworkshop.io;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Flush {
    public static void main(String[] args) {
        Writer w = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
        PrintWriter pw = new PrintWriter(w);

        pw.println("Hallo, ihr alle!");
        pw.println("Hallo, JAX");
        pw.println("Hallo, Welt");

        pw.flush(); // nötig, damit die Daten aus dem Writer nach System.out geschrieben werden

// NEIN -> dies würde System.out schließen!        pw.close();

        System.out.println("...");
    }
}
