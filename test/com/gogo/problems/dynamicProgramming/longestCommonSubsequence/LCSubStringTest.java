package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LCSubStringTest {

    @Test
    void findLCSubstring() {
        String x = "abcde";
        String y = "abxyz";
        assertEquals(2, new LCSubString().findLCSubstring(x, y));
    }
}