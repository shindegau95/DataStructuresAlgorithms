package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

public class ShortestCommonSuperSequence {
    /*
     * Given 2 strings
     * a = "geek"
     * b = "eke"
     *
     * merge the 2 strings such that we are able to get "geek" and "eke"
     *
     * Worst case
     * "geekeke"
     * but ek is common thus shortest = a + b - lcs(a,b) i.e. geeke
     * */

    int lengthOfSCS(String a, String b) {
        return a.length() + b.length() - new PrintLCSubsequence().lcSubsequence(a, b).length();
    }
}
