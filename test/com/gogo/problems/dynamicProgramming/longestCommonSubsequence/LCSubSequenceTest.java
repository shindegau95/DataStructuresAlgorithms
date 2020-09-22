package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

import org.junit.jupiter.api.Test;

class LCSubSequenceTest {

    @Test
    void findLCSLengthRecursive() {
        String x = "abcdh";
        String y = "abedfghr";
        new LCSubSequence().findLCSLengthRecursive(x, y, x.length(), y.length());
    }

    @Test
    void findLCSLengthMemoized() {
        String x = "abcdh";
        String y = "abedfghr";
        new LCSubSequence().findLCSLengthMemoized(x, y);
    }

    @Test
    void findLCSLengthTabular() {
        String x = "abcdh";
        String y = "abedfghr";
        new LCSubSequence().findLCSLengthTabular(x, y);
    }
}