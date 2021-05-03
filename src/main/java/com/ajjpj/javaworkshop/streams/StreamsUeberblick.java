package com.ajjpj.javaworkshop.streams;

import java.util.List;

public class StreamsUeberblick {

    public static void main(String[] args) {
        List.of(1,2,3,4).stream(); // tut nichts
//        List.of(1,2,3,4).stream().forEach(System.out::println);
//        List.of(1,2,3,4).forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8).stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

//        List.of(1,2,3,4).parallelStream(); // Empfehlung nicht nehmen

        List.of(1,2,3,4,5).stream()
                .map(i -> convert(i, "Mein Text"))
                .forEach(System.out::println);



    }

    static String convert(int i, String text) {
        return i + text;
    }
}
