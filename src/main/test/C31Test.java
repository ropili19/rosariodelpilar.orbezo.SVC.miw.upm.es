package main.test;


import main.C31;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C31Test {
    C31 c31;
    @BeforeEach
    void before() {
        c31 = new C31();
    }

    @Test
    void testM1() {
        assertEquals("m1", c31.m1());
    }
    @Test
    void testM2() {
        assertEquals("m2", c31.m2());
    }

}
