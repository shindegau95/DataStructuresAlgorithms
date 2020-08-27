package com.gogo.problems.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstRecurringCharacterProblemTest {

    @Test
    void getFirstRecurring() {
        assertEquals(2, FirstRecurringCharacterProblem.getFirstRecurring(new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4}));
        assertEquals(1, FirstRecurringCharacterProblem.getFirstRecurring(new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4}));
        assertEquals(null, FirstRecurringCharacterProblem.getFirstRecurring(new int[]{2, 3, 4, 5}));
    }
}