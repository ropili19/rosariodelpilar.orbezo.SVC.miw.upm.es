package main.test;

import main.C32;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C32Test {
    C32 c32;
    @BeforeEach
    void before() {
        c32 = new C32();
    }

    @Test
    void testMA() {
        assertEquals("mA", c32.mA());
    }
}
