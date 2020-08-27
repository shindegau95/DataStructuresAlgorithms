package com.gogo.problems.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseStringProblemTest {

    @Test
    void reverseString() {
        assertEquals("cba", ReverseStringProblem.reverseString("abc"));
        assertEquals("a", ReverseStringProblem.reverseString("a"));
        assertThrows(NullPointerException.class, () -> ReverseStringProblem.reverseString(null));
    }
}