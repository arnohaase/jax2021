package com.ajjpj.javaworkshop.primitives;

import java.util.List;

public class Primitives {
    public static void main(String[] args) {
        int i = 10;
        Integer i2 = 10;

        int j = i2;

//        Long l = i2;

        Integer nullInt = null;
//        intMethod(nullInt);
//        int crash = nullInt;

        System.out.println(Integer.parseInt("100", 10));
        System.out.println(Integer.parseInt("100", 2));

    }

    static void intMethod(int i) {
    }
}
