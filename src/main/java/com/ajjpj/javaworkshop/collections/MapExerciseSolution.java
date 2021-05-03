package com.ajjpj.javaworkshop.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExerciseSolution {
}

class TeilnehmerVerwaltungSolution {
    private final Map<String,Set<String>> teilnehmerJeKurs = new HashMap<>();

    // *nie* null liefern, sondern ggf. leere Liste
    Set<String> teilnehmerFuerKurs(String kurs) {
        return Set.copyOf(teilnehmerJeKurs.getOrDefault(kurs, Set.of()));
    }

    Set<String> kurseFuerTeilnehmer(String teilnehmer) {
        Set<String> result = new HashSet<>();
        for(String kurs: teilnehmerJeKurs.keySet()) {
            if(teilnehmerJeKurs.get(kurs).contains(teilnehmer))
                result.add(kurs);
        }

        return Set.copyOf(result);
    }

    Set<String> kurseFuerTeilnehmer2(String teilnehmer) {
        return teilnehmerJeKurs.keySet()
                .stream()
                .filter(k -> teilnehmerJeKurs.get(k).contains(teilnehmer))
                .collect(Collectors.toSet());
    }

        // Kurs wird ggf. automatisch angelegt
    void registriereTeilnehmer(String kurs, String teilnehmer) {
        teilnehmerJeKurs.computeIfAbsent(kurs, k -> new HashSet<>())
                .add(teilnehmer);
    }

    // optional
    void entferneTeilnehmer(String kurs, String teilnehmer) {
        var set = teilnehmerJeKurs.computeIfAbsent(kurs, k -> new HashSet<>());
        set.remove(teilnehmer);
        if(set.isEmpty())
            teilnehmerJeKurs.remove(kurs);
    }
}
