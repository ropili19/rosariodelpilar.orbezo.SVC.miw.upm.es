package main.test;

import main.C21;
import main.C22;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C22Test {
    C22 c22;
    @BeforeEach
    void before() {
        c22 = new C22();
    }

    @Test
    void testMA() {
        assertEquals("mA", c22.mA());
    }

}
