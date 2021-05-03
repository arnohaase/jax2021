package com.ajjpj.javaworkshop.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimes {
    public static void main(String[] args) {
        LocalDate mayFirst = LocalDate.of(2021, 5, 1);
        LocalDate christmas = LocalDate.of(2021, 12, 24);

        System.out.println(mayFirst.until(christmas));
        System.out.println(mayFirst.until(christmas, ChronoUnit.DAYS));
        System.out.println(mayFirst.until(christmas, ChronoUnit.MONTHS));

        LocalDateTime ldt = LocalDateTime.of(2021, 5, 10, 12, 23, 10);
        System.out.println(ldt);
    }
}
