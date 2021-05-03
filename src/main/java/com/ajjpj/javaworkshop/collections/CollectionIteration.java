package com.ajjpj.javaworkshop.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionIteration {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
            if (i%2 == 0) {
                iterator.remove();
                System.out.println("removed");
            }
        }

        for (int i : list) {
            System.out.println(i);
//            list.remove(3);
        }

    }

}
