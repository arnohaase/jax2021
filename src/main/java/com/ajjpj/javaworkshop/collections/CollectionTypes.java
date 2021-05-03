package com.ajjpj.javaworkshop.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTypes {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(2);

        System.out.println(list.get(4));

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(5);
        set.add(2);

        System.out.println(set.contains(1));
        System.out.println(set.size());
    }
}