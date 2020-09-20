package com.gogo.problems.dynamicProgramming.zeroOneknapsacks;

public class CountSubsetWithSum {
    /*
     * Given an array, count the number of subsets with given sum
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
                return countSubset(arr, sum, n - 1);
            } else {
                int included = countSubset(arr, sum - arr[n - 1], n - 1);
                int excluded = countSubset(arr, sum, n - 1);
                return included + excluded;
            }
        }
    }
}
