package com.ajjpj.javaworkshop.time;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Instants {
    public static void main(String[] args) {
        Instant start = Instant.now();

        System.out.println(start);

        Instant end = Instant.now(); //.plus(100, ChronoUnit.DAYS);

        System.out.println(start.isBefore(end));
        System.out.println(start.until(end, ChronoUnit.NANOS));
        System.out.println(start.until(end, ChronoUnit.MICROS));
        System.out.println(start.until(end, ChronoUnit.MILLIS));
        System.out.println(start.until(end, ChronoUnit.MONTHS));
    }
}
