package com.ajjpj.javaworkshop.primitives;


public class StringsMultiline {
    public static void main(String[] args) {
        String multiline = """
                Dies ist
                    ein Text
                       mit Einrückung
                ...
                """;

        System.out.println(multiline.indent(10));
    }
}
