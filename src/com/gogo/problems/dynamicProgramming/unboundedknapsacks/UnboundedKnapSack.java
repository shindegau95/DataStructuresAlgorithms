package com.gogo.problems.dynamicProgramming.unboundedknapsacks;

public class UnboundedKnapSack {

    /*
     * in array of items the same item can be considered more than once
     *
     * */

    public int unboundedKnapSackRecursive(int[] wt, int[] val, int n, int capacity) {
        if (capacity == 0 || n == 0) {
            return 0;
        } else {
            if (wt[n - 1] > capacity) {
                return unboundedKnapSackRecursive(wt, val, n - 1, capacity);
            } else {
                int included = unboundedKnapSackRecursive(wt, val, n, capacity - wt[n - 1]) + val[n - 1];
                int excluded = unboundedKnapSackRecursive(wt, val, n - 1, capacity);
                return Math.max(included, excluded);
            }
        }
    }
}
