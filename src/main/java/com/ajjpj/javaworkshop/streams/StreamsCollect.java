package com.ajjpj.javaworkshop.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCollect {

    public static void main(String[] args) {
        List.of(1,2,3,4,5,6,7,8).stream()
                .filter(i -> i%2 == 0)
                .collect(Collectors.toList());

        List.of(1,2,3,4,5,6,7,8,8,8).stream()
                .filter(i -> i%2 == 0)
                .collect(Collectors.toSet());

        List.of(1,2,3,6,8,9).stream()
                .filter(i -> i%2 == 0)
                .findAny()
                .orElseGet(() -> -1);

        long anzahl = List.of(1,2,2,2,3,3,3,3,6,8,9).stream()
                .distinct()
                .count();
        System.out.println("Anzahl: "+anzahl);

        Collection<Number> numbers = new ArrayList<>();
        numbers.add(Long.valueOf(1));
        numbers.add(Long.valueOf(2));
        numbers.add(Integer.valueOf(4));

        numbers.stream()
                .filter(i -> isInteger(i))
                .map(i -> (Integer) i)
                .map(i-> "Integer: "+i)
                .forEach(System.out::println);


    }

    static boolean isInteger(Number n) {
        return n instanceof Integer;
    }
}
