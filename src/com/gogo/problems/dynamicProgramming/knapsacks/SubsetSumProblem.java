package com.gogo.problems.dynamicProgramming.knapsacks;

public class SubsetSumProblem {
    /*
     * Given an array, is there a subset that gives the desired sum or not
     * eg.
     * Input arr[] = {2, 3, 7, 8, 10}
     * sum = 11
     * */

    public boolean isSumPresent(int[] arr, int sum, int n) {
        if (sum == 0 || sum == arr[n]) {
            return true;
        } else if (n == 0 && sum > arr[n]) {
            return false;
        } else {
            if (arr[n - 1] > sum) {
                return false;
            } else {
                boolean included = isSumPresent(arr, sum - arr[n - 1], n - 1);
                boolean excluded = isSumPresent(arr, sum, n - 1);
                return included || excluded;
            }
        }
    }
}
