package com.ajjpj.javaworkshop.primitives;

import java.nio.charset.StandardCharsets;

public class StringEncodingExercise {
    public static double bytesPerCharacterUtf8(String s) {
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        return bytes.length * 1.0 / s.length();
    }
}
