package com.nicolas.savoini.scope;

import org.junit.jupiter.api.Test;

class ScopeExerciseTest {

    @Test
    void testScopeExercise() {

        ScopeExercise scopeExercise = new ScopeExercise();
        scopeExercise.start();
        scopeExercise.pause();
        scopeExercise.stop();

    }
}
