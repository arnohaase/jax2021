package com.ajjpj.javaworkshop.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeApiFormat {
    public static void main(String[] args) {
        Instant now = Instant.now();

        System.out.println(
                DateTimeFormatter.ofPattern("dd.MM.yyyy")
                .format(LocalDateTime.ofInstant(now, ZoneId.of("Europe/Berlin")))
        );
    }
}
