package main.test;

import main.C21;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C21Test {
    C21 c21;
    @BeforeEach
    void before() {
        c21 = new C21();
    }

    @Test
    void testM1() {
        assertEquals("m1", c21.m1());
    }
    @Test
    void testM2() {
        assertEquals("m2", c21.m2());
    }
}
