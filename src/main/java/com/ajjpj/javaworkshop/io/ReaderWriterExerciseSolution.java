package com.ajjpj.javaworkshop.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class ReaderWriterExerciseSolution {

    public static String readFileIntoString1(File f, Charset charset) throws IOException {
        return Files.readString(f.toPath(), charset);
    }

    public static String readFileIntoString2(File f, Charset charset) throws IOException {
        StringBuilder result = new StringBuilder();
        try(Reader r = new FileReader(f, charset)) {
            int i;
            while((i = r.read()) != -1) {
                result.append((char)i); // wichtig: als char anhängen - sonst hat man die Dezimaldarstellung im String
            }
        }
        return result.toString();
    }

    // eine Datei in einem Encoding einlesen und in einem anderen Encoding schreiben
    public static void transcode(File in, Charset encodingIn, File out, Charset encodingOut) throws IOException {
        try(Reader r = new FileReader(in, encodingIn);
                Writer w = new FileWriter(out, encodingOut)
        ) {
            r.transferTo(w);
        }
    }
}
