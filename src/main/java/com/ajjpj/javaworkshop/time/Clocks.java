package com.ajjpj.javaworkshop.time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Clocks {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        Clock.tick(clock, Duration.of(1, ChronoUnit.SECONDS));

        Instant now = Instant.now(clock);
    }
}
