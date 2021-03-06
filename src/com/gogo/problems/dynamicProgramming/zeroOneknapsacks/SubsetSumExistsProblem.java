package com.gogo.problems.dynamicProgramming.zeroOneknapsacks;

public class SubsetSumExistsProblem {
    /*
     * Given an array, is there a subset that gives the desired sum or not
     * eg.
     * Input arr[] = {2, 3, 7, 8, 10}
     * sum = 11
     * Output true
     * */

    public boolean isSumPresent(int[] arr, int sum, int n) {
        if (sum == 0) {
            return true;
        } else if (n == 0) {
            return false;
        } else {
            if (arr[n - 1] > sum) {
                return isSumPresent(arr, sum, n - 1);
            } else {
                boolean included = isSumPresent(arr, sum - arr[n - 1], n - 1);
                boolean excluded = isSumPresent(arr, sum, n - 1);
                return included || excluded;
            }
        }
    }
}
