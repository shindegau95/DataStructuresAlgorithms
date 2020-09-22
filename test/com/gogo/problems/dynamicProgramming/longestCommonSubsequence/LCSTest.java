package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

import org.junit.jupiter.api.Test;

class LCSTest {

    @Test
    void findLCSLengthRecursive() {
        String x = "abcdh";
        String y = "abedfghr";
        new LCS().findLCSLengthRecursive(x, y, x.length(), y.length());
    }

    @Test
    void findLCSLengthMemoized() {
        String x = "abcdh";
        String y = "abedfghr";
        new LCS().findLCSLengthMemoized(x, y);
    }

    @Test
    void findLCSLengthTabular() {
        String x = "abcdh";
        String y = "abedfghr";
        new LCS().findLCSLengthTabular(x, y);
    }
}