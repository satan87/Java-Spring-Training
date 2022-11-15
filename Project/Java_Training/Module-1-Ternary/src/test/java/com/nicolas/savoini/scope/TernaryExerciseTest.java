package com.nicolas.savoini.scope;

import com.nicolas.savoini.ternary.TernaryExercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TernaryExerciseTest {

    @Test
    void testEven() {

        assertEquals("YES", new TernaryExercise().even(2));
        assertEquals("NO", new TernaryExercise().even(3));
    }

    @Test
    void testCheck() {

        assertEquals(1, new TernaryExercise().check("Java"));
        assertEquals(-1, new TernaryExercise().check("bcd"));
        assertEquals(-1, new TernaryExercise().check(null));
    }
}
