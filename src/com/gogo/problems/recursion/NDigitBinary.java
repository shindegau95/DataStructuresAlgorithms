package com.gogo.problems.recursion;

import java.util.HashSet;
import java.util.Set;

public class NDigitBinary {
    /*
     * For any given n,
     * the number of 1s in the prefix shall be greater than the number of 0s
     * eg. for 11010
     * number    |   prefix 1s   |   number of 0s
     * 11010     |           3   |           0
     * 1101      |           3   |           1
     * 110       |           2   |           1
     * 11        |           2   |           2
     * 1         |           1   |           2
     * */

    static Set<String> hashSet = new HashSet<>();

    public static void main(String[] args) {
        String output = "";
        int n = 5;
        int ones = 0;
        int zeros = 0;

        solve(ones, zeros, n, output);
        System.out.println(hashSet);
    }

    private static void solve(int ones, int zeros, int n, String output) {
        if (ones + zeros == n) {
            hashSet.add(output);
            return;
        }

        String op = output + "1";
        solve(ones + 1, zeros, n, op);

        if (ones > zeros) {
            String op1 = output + "0";
            solve(ones, zeros + 1, n, op1);
        }
    }
}
