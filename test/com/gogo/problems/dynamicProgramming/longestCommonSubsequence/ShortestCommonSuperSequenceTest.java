package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestCommonSuperSequenceTest {
    @Test
    void findLengthOfSCS() {
        String x = "geek";
        String y = "eke";
        assertEquals(5, new ShortestCommonSuperSequence().lengthOfSCS(x, y));
    }
}