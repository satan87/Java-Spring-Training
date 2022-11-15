package com.nicolas.savoini.scope;

import com.nicolas.savoini.optional.OptionalExercise;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionalExerciseTest {

    @Test
    void testGetString() {

        assertEquals(Optional.empty(), new OptionalExercise().getString(1));
        assertEquals(Optional.of("2"), new OptionalExercise().getString(2));
        assertEquals(Optional.of("30"), new OptionalExercise().getString(30));
    }
}
