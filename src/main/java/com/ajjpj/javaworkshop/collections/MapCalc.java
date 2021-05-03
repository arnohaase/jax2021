package com.ajjpj.javaworkshop.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MapCalc {
    static Map<String, AtomicInteger> counter = new HashMap<>();

    static void inc(String key) {
        if(counter.containsKey(key)) {
            counter.put(key, new AtomicInteger(1));
        }
        else {
            var c = counter.get(key);
            c.incrementAndGet();
        }
    }

    static void inc2(String key) {
        var c = counter.computeIfAbsent(key, k -> new AtomicInteger(0));
        c.incrementAndGet();
    }
}
