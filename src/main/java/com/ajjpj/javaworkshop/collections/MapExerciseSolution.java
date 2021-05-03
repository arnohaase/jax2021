package com.ajjpj.javaworkshop.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExerciseSolution {
}

class TeilnehmerVerwaltungSolution {
    private final Map<String,Set<String>> teilnehmerJeKurs = new HashMap<>();

    // *nie* null liefern, sondern ggf. leere Liste
    Set<String> teilnehmerFuerKurs(String kurs) {
        return teilnehmerJeKurs.getOrDefault(kurs, Set.of());
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
