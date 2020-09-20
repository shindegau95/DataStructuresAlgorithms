package com.gogo.problems.dynamicProgramming.zeroOneknapsacks;

public class EqualSumPartition {
    /*
     * Given an array of n elements,
     * if divided into 2 subsets, such that the sum of the sub arrays is equal
     * eg.
     * Input arr[]  = {1, 5, 11, 5}
     * Output = true
     *
     * */

    SubsetSumExistsProblem subsetSumExistsProblem = new SubsetSumExistsProblem();

    public boolean isEqualSumPartitionPossible(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return isFeasible(arr, sum, arr.length - 1);
    }

    private boolean isFeasible(int[] arr, int sum, int n) {
        if (sum % 2 != 0) {
            return false;
        } else {
            return subsetSumExistsProblem.isSumPresent(arr, sum / 2, n);
        }
    }


}
