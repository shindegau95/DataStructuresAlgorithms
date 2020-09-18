package com.gogo.problems.dynamicProgramming.knapsacks;

public class CountSubsetProblem {
    /*
     * Given an array, count the number of subsets
     * eg.
     * Input arr[] = {2, 3, 5, 6, 8, 10}
     * sum = 10
     * Output
     * */

    public int countSubset(int[] arr, int sum, int n) {
        if (sum == 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            if (arr[n - 1] > sum) {
                return 0;
            } else {
                return countSubset(arr, sum - arr[n - 1], n - 1) + countSubset(arr, sum, n - 1);
            }
        }
    }
}
