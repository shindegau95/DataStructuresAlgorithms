package com.gogo.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseStringProblemTest {

    ReverseStringProblem reverseStringProblem;

    @BeforeEach
    void setUp() {
        reverseStringProblem = new ReverseStringProblem();
    }

    @Test
    void reverseString() {
        assertEquals("cba", reverseStringProblem.reverseString("abc"));
        assertEquals("a", reverseStringProblem.reverseString("a"));
        assertThrows(NullPointerException.class, () -> reverseStringProblem.reverseString(null));
    }
}