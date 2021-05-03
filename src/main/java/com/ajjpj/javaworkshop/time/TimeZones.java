package com.ajjpj.javaworkshop.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeZones {
    public static void main(String[] args) {
        Instant now = Instant.now();

        ZoneId zone = ZoneId.of("Europe/Berlin");

        LocalDateTime local = LocalDateTime.ofInstant(now, zone);

        System.out.println(now);
        System.out.println(local);
    }
}
