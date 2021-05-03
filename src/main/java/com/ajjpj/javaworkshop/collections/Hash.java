package com.ajjpj.javaworkshop.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Hash {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        Person key = new Person("key");

        map.put(new Person("a"), "x");
        map.put(new Person("a"), "y");
        map.put(key, "value");

        System.out.println(map);

        System.out.println(map.get(new Person("key")));

        key.name = "key2";
        System.out.println(map);
        System.out.println(map.get(new Person("key")));
        System.out.println(map.get(new Person("key2")));
    }
}

class Person {
    Person(String name) {
        this.name = name;
    }

    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}


