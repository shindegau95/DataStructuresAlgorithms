package com.gogo.problems.others;

public class ClimbStairs {
    /*
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * eg.
     * Input: 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     * */

    int[] mem = new int[46];

    public int climbStairsRecursive(int n) {
        //brute force
        /*
         * 1 and 2 steps are the base
         * 1 -> 1
         * 2 -> 2
         * 3 -> 1 + 2
         * 4 -> 2 + 3 = 5
         * */
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
        }
    }

    public int climbStairs(int n) {
        if (n == 1) {
            mem[n] = 1;
        } else if (n == 2) {
            mem[n] = 2;
        } else {
            mem[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return mem[n];
    }

}
