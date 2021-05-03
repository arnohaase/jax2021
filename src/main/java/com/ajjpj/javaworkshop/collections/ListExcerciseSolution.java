package com.ajjpj.javaworkshop.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListExcerciseSolution {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 3, 4, 2, 3, 4);
        System.out.println("--- duplicates ---");
        for (int duplicate : duplicates(list)) {
            System.out.println(duplicate);
        }
        System.out.println("--- duplicatesSet ---");
        for (int duplicate : duplicatesSet(list)) {
            System.out.println(duplicate);
        }
        System.out.println("--- duplicateIndices ---");
        for (int duplicate : duplicateIndices(list)) {
            System.out.println(duplicate);
        }

        // wenn man indices zum löschen nutzen will dann rückwärts
        List<Integer> duplicateIndex = new ArrayList<>(duplicateIndices(list));
        Collections.sort(duplicateIndex, Comparator.reverseOrder()); // <- rückwärts sortieren
        List<Integer> cleanList = new ArrayList<>(list);
        for (int indexToDelete : duplicateIndex) {
            cleanList.remove(indexToDelete);
        }
        System.out.println("clean list - all that have duplicate removed");
        for (int i : cleanList) {
            System.out.println(i);
        }


    }

    /**
     * @return Alle Elemente die es in der Liste mehr als einmal gibt
     */
    private static Set<Integer> duplicates (List<Integer> list) {
        Set<Integer> duplicates = new HashSet<>();
        for (Integer value : list) {
            // nicht sehr performant aber wenn man die Indizes weiter braucht durchaus nützlich
            if (list.indexOf(value) != list.lastIndexOf(value)) {
                duplicates.add(value);
            }
        }
        return duplicates;
    }

    /**
     * @return Alle Elemente die es in der Liste mehr als einmal gibt
     */
    private static Set<Integer> duplicatesSet (List<Integer> list) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (Integer value : list) {
            if (!seen.add(value)) {
                // war schon in dem set wurde also schon gesehen
                duplicates.add(value);
            }
        }
        return duplicates;
    }

    /**
     * @return Alle index an denen Duplikate vorkommen
     */
    private static Set<Integer> duplicateIndices (List<Integer> list) {
        Set<Integer> duplicateIndex = new HashSet<>();
        Map<Integer, Integer> valueToLastIndex = new HashMap<>();
        for (int index=0; index<list.size(); index++) {
            Integer value = list.get(index);
            Integer lastIndex = valueToLastIndex.put(value, index);
            if (lastIndex!=null) {
                // war schon mal gesehen worden mit dem index
                duplicateIndex.add(lastIndex);
                duplicateIndex.add(index);
            }
        }
        return duplicateIndex;
    }


}
