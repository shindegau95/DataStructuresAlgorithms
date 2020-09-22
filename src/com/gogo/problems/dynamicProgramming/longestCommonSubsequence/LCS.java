package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

public class LCS {
    /*
     * Given 2 strings x and y
     * x = "abcdgh"
     * y = "abedfhr"
     * */

    /*
     * for memoized version
     *
     * */
    int[][] t;

    int findLCSLengthRecursive(String x, String y, int xp, int yp) {
        if (xp == 0 || yp == 0) {
            return 0;
        } else {
            if (x.charAt(xp - 1) == y.charAt(yp - 1)) {
                return findLCSLengthRecursive(x, y, --xp, --yp) + 1;
            } else {
                int includeX = findLCSLengthRecursive(x, y, --xp, yp);
                int includeY = findLCSLengthRecursive(x, y, xp, --yp);
                return Math.max(includeX, includeY);
            }
        }
    }

    int findLCSLengthMemoized(String x, String y) {
        t = new int[x.length()][y.length()];
        return findLCSLengthMemoized(x, y, x.length() - 1, y.length() - 1);
    }

    private int findLCSLengthMemoized(String x, String y, int xp, int yp) {
        if (xp == 0 || yp == 0) {
            t[xp][yp] = 0;
        } else {
            if (t[xp][yp] == -1) {
                if (x.charAt(xp - 1) == y.charAt(yp - 1)) {
                    t[xp][yp] = findLCSLengthMemoized(x, y, xp - 1, yp - 1) + 1;
                } else {
                    int includeX = findLCSLengthMemoized(x, y, xp - 1, yp);
                    int includeY = findLCSLengthMemoized(x, y, xp, yp - 1);
                    t[xp][yp] = Math.max(includeX, includeY);
                }
            }
        }
        return t[xp][yp];
    }

    int findLCSLengthTabular(String x, String y) {
        t = new int[x.length()][y.length()];
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                t[i][j] = 0;
            }
        }


        for (int i = 1; i < x.length(); i++) {
            for (int j = 1; j < y.length(); j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    t[i][j] = t[i - 1][j - 1] + 1;
                } else {
                    int included = t[i - 1][j];
                    int excluded = t[i][j - 1];
                    t[i][j] = Math.max(included, excluded);
                }

            }
        }

        return t[x.length() - 1][y.length() - 1];
    }


}
