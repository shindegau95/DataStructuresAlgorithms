package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintLCSubsequenceTest {

    @Test
    void lcSubsequence() {
        String x = "abcdef";
        String y = "abdxf";
        assertEquals("abdf", new PrintLCSubsequence().lcSubsequence(x, y));
    }
}