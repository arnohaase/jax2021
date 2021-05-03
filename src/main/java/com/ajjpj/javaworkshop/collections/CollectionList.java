package com.ajjpj.javaworkshop.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList{
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,1,2,3,2);
        List<Integer> list1 = new ArrayList<>(list);
        list1.add(5);
        System.out.println(list1.get(3));

        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(1));

    }
}
