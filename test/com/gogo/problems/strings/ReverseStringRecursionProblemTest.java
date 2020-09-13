package com.gogo.problems.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringRecursionProblemTest {

    ReverseStringRecursionProblem recursionProblem;

    @BeforeEach
    void setUp() {
        recursionProblem = new ReverseStringRecursionProblem();
    }

    @Test
    void reverseString() {
        assertEquals("cba", recursionProblem.reverseString("abc"));
    }
}