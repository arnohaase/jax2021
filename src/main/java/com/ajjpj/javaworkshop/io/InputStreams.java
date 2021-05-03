package com.ajjpj.javaworkshop.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreams {
    public static void main(String[] args) throws IOException {
        // InputStream und OutputStream werden *beide* vom try-with-resources geschlossen!
        // Es ist wichtig, dass bei beiden immer close() aufgerufen wird.

        try(InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("random_data.dat");
                OutputStream os = new FileOutputStream("dummy.out")) {
            int b;
            while ((b = is.read()) != -1) {
                System.out.println(b);

                if(b < 20) {
                    os.write(b);
                }

                // hier nicht nötig, aber zur Demo
                os.flush();
            }
        }
    }
}
