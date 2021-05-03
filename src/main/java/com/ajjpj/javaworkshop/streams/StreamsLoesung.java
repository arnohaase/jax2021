package com.ajjpj.javaworkshop.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsLoesung {

    public static void main(String[] args) {
        nameWithA(List.of("Arno", "Heinz", "Alex", "Nico", "Alouise", "Alf"))
                .forEach(System.out::println);

        System.out.println(new StreamsLoesung().sortInLength("Die ist ein Satz mit mehreren Wörtern die kurz oder länglicher sind"));
    }

    // Liste von Namen durchsuchen und die namen zurückgeben, die mit "A" anfangen
    public static List<String> nameWithA(List<String> names) {
        return names.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
    }

    /**
     * Einen Satz in Wörter zu zerlegen und in einer Map nach der länge der Wörter Sortieren
     *
     * 3 -> Ich, Bin
     * 4 -> eine
     * 8 -> funktion
     */
    public Map<Integer, List<String>> sortInLength(String satz) {
        return Arrays.stream(satz.split(" "))
                .collect(Collectors.toMap(String::length, List::of, this::merge));
    }

    List<String> merge(List<String> l1, List<String> l2) {
        return Stream.of(l1, l2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
