package com.gogo.problems.dynamicProgramming.zeroOneknapsacks;

public class TargetSum {
    /*
     * Given an array {1, 1, 2, 3}
     * and target Sum = 1
     *
     * then using operators + or -. achieve the sum
     * op = 3
     *
     * +1 -1 -2 +3
     * -1 +1 -2 +3
     * +1 +2 +2 -3 *<- consider this
     *
     * Here we split the arr into sets {1, 1 ,2} and  {3}
     * difference being equal to the given sum
     *
     * */

    int getCountForTargetSum(int[] arr, int targetSum) {
        return new CountSubsetWithDifference().countSubSetWithDifference(arr, targetSum);
    }
}
