package com.ajjpj.javaworkshop.collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1,3,2,5,6);
        Set<Integer> setModifiable = new HashSet<>();
        setModifiable.add(1);
//        set.add(1);

        System.out.println(set.contains(1));
    }
}
