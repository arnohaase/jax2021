package com.ajjpj.javaworkshop.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map);

        map.put("a", "bcd");
        map.put("x", "yz");
        System.out.println(map);

        map.put("a", "whatever");
        System.out.println(map);

        map.put("b", null);
        System.out.println(map);

        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));

        System.out.println(map.containsKey("b"));
        System.out.println(map.containsKey("c"));

        System.out.println(map.getOrDefault("q", "<unknown>"));

        var keys = map.keySet();
        var values = map.values();

        for (String k: map.keySet()) {
            System.out.println(k);
        }
    }
}
