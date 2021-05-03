package com.ajjpj.javaworkshop.primitives;


public class Strings {
    public static void main(String[] args) {
        String s = "Dies \n \t ist ein Text: \u20bf";
        System.out.println(s);

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch + ": " + Character.isWhitespace(ch) + " / " + Character.isLowerCase(ch));
        }

        System.out.println(s.substring(8, 15));
    }
}
