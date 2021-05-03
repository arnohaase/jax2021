package com.ajjpj.javaworkshop.io;

import java.io.*;

public class InputStreamExerciseSolution {
    public static int count99(File f) throws IOException {
        int count = 0;
        try(InputStream in = new FileInputStream(f)) {
            int b;
            while((b = in.read()) != -1) {
                if(b == 99) count += 1;
            }
        }
        return count;
    }

    public static void separateEvenOdd(File input, File outputEven, File outputOdd) throws IOException {
        try(InputStream in = new FileInputStream(input);
                OutputStream outEven = new FileOutputStream(outputEven);
                OutputStream outOdd = new FileOutputStream(outputOdd)) {
            int b;
            while((b = in.read()) != -1) {
                if ((b & 1) == 0) {
                    outEven.write(b);
                }
                else {
                    outOdd.write(b);
                }
            }
        }
    }
}
