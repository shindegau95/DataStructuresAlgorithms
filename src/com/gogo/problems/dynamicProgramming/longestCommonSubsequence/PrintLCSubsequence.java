package com.gogo.problems.dynamicProgramming.longestCommonSubsequence;

public class PrintLCSubsequence {
    String[][] t;

    public String lcSubsequence(String x, String y) {
        t = new String[x.length()][y.length()];

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                if (i == 0 || j == 0) {
                    if (x.charAt(i) == y.charAt(j)) {
                        t[i][j] = String.valueOf(x.charAt(i));
                    } else {
                        t[i][j] = "";
                    }
                } else {
                    if (x.charAt(i) == y.charAt(j)) {
                        t[i][j] = t[i - 1][j - 1] + x.charAt(i);
                    } else {
                        String a = t[i][j - 1];
                        String b = t[i - 1][j];
                        t[i][j] = a.length() > b.length() ? a : b;
                    }
                }
            }
        }

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        return t[x.length() - 1][y.length() - 1];
    }
}
