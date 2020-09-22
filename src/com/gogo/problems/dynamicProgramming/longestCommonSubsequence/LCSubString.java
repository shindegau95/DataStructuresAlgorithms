package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

public class LCSubString {

    int findLCSubstring(String x, String y) {
        int[][] t = new int[x.length()][y.length()];

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        int MAX = 0;
        for (int i = 1; i < x.length(); i++) {
            for (int j = 1; j < y.length(); j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = t[i - 1][j - 1] + 1;
                    MAX = Math.max(MAX, t[i][j]);
                } else {
                    t[i][j] = 0;
                }
            }
        }
        return MAX;
    }
}
