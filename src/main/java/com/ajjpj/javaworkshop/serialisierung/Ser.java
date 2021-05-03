package com.ajjpj.javaworkshop.serialisierung;

import java.io.*;
import java.util.List;

public class Ser {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.name = "yo";

        var baos = new ByteArrayOutputStream();
        var oos = new ObjectOutputStream(baos);

        oos.writeObject(p);

        oos.close();

        var bytes = baos.toByteArray();
        System.out.println(bytes.length);

        //------------ Systemgrenze

        var bais = new ByteArrayInputStream(bytes);
        var ois = new ObjectInputStream(bais);

        ois.setObjectInputFilter(fi -> {
            System.out.println(fi.serialClass());

            if(fi.serialClass().equals(Address.class))
                return ObjectInputFilter.Status.REJECTED;

            return ObjectInputFilter.Status.ALLOWED;
        });

        Person p2 = (Person) ois.readObject();

        System.out.println(p2);
    }
}

class Person implements Serializable {
    String name;
    List<Object> l = List.of(1, 2, 3);
    Address address = new Address();

    static {
        System.out.println("ich tue gefährliche Dinge");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Address implements Serializable {

}