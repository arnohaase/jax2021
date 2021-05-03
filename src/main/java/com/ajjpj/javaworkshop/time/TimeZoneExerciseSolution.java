package com.ajjpj.javaworkshop.time;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeZoneExerciseSolution {

    // ist es zwischen 13:00 und 14:00 Ortszeit an einem Arbeitstag
    public static boolean istMittagspause(Instant i, ZoneId zoneId) {
        LocalDateTime ldt = LocalDateTime.ofInstant(i, zoneId);
        return ldt.getHour() == 13 &&
                ldt.getDayOfWeek() != DayOfWeek.SATURDAY &&
                ldt.getDayOfWeek() != DayOfWeek.SUNDAY;
    }
}
