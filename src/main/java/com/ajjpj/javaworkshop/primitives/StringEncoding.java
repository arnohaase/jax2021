package com.ajjpj.javaworkshop.primitives;

import java.nio.charset.StandardCharsets;

public class StringEncoding {
    public static void main(String[] args) {
        String s = "Hallöchen \u20bf";
        System.out.println(s);

        byte[] bytes2 = s.getBytes(StandardCharsets.ISO_8859_1);
        String s2 = new String(bytes2, StandardCharsets.ISO_8859_1);
        System.out.println(s2);

        byte[] bytes3 = s.getBytes(StandardCharsets.UTF_8);
        String s3 = new String(bytes3, StandardCharsets.UTF_8);
        System.out.println(s3);

        System.out.println(new String(bytes3, StandardCharsets.ISO_8859_1));
        System.out.println("Windows-Problem: " + new String(bytes3));

        System.out.println(s.length());
        System.out.println(bytes2.length);
        System.out.println(bytes3.length);
    }

}
