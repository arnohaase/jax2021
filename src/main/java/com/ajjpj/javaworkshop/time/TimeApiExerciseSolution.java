package com.ajjpj.javaworkshop.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeApiExerciseSolution {
    // Was ist der Wochentag des Geburtstags?
    public static DayOfWeek wochentagDesGeburtstags(LocalDate geburtstag) {
        return geburtstag.getDayOfWeek();
    }

    // an welchem Tag ist man 10.000 Tage alt?
    public static LocalDate zehntausendsteLebensTag(LocalDate geburtstag) {
        return geburtstag.plus(10_000, ChronoUnit.DAYS);
    }
}
