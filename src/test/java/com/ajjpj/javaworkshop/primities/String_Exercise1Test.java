package com.ajjpj.javaworkshop.primities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.ajjpj.javaworkshop.primitives.String_Exercise1;

class String_Exercise1Test {
    @Test
    void testFirstIdentifier() {
        assertEquals("Abc99", String_Exercise1.firstIdentifier("123Abc99 "));
        assertEquals("Xyz", String_Exercise1.firstIdentifier("Xyz"));
        assertEquals(null, String_Exercise1.firstIdentifier("123"));
    }
}
