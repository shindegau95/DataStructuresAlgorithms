package com.gogo.problems.dynamicProgramming.zeroOneknapsacks;

public class MinimumSubsetDifference {
    /*
     * Given an array, divide it into subsets such that the difference is minimum
     * eg.
     * Input arr = {1, 6, 11, 5}
     * op = 1
     * */

    /*
     * idea is to turn it into a sum problem
     * difference in subsets will have range between
     * no elements -> 0  and all elements -> arrSum
     *
     * for above array, the sum will be from 0 till 23
     * in fact the sums can be  = {sumSubSet, totalSum - sumSubSet}
     * thus, difference = totalSum - 2sumSubSet
     * need to minimize this
     * */

    public int minSubSet(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return findMinSubset(arr, sum, 0, arr.length);
    }

    private int findMinSubset(int[] arr, int totalSum, int sum, int n) {
        if (n == 0) {
            return Math.abs(totalSum - 2 * sum);
        } else {
            int included = findMinSubset(arr, totalSum, sum + arr[n - 1], n - 1);
            int excluded = findMinSubset(arr, totalSum, sum, n - 1);
            return Math.min(included, excluded);
        }
    }
}
