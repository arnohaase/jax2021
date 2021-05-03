package com.ajjpj.javaworkshop.memleaks;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MemLeakMaps {
    static final Map<Person, AtomicInteger> statistics = new WeakHashMap<>();

    public void veryImportantApi(Person person) {
        statistics.computeIfAbsent(person, p -> new AtomicInteger()).incrementAndGet();

        // do the important stuff
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}


