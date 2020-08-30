package com.gogo.problems.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestWordProblemTest {

    @Test
    void getLongestWord() {
        assertEquals("time", LongestWordProblem.getLongestWord("fun&!! time"));
        assertEquals("love", LongestWordProblem.getLongestWord("I love dogs"));
    }
}