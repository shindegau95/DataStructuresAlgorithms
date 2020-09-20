package com.gogo.problems.dynamicProgramming.knapsacks;

public class CountSubsetWithDifference {

    /*
     * Consider arr = {1, 1, 3, 2} and difference = 1
     * op = 3
     *
     * {1, 3} & {1, 2}
     * {1, 3} & {1, 2} //different one
     * {1, 1, 2}  & {3}
     *
     * here,
     * sum(s1) - sum(s2) = diff
     * sum(s1) + sum(s2) = totalSum
     *
     * Adding,
     * 2sum(s1) = diff + totalSum
     * sum(s1) = ( diff + totalSum ) / 2
     * */

    int countSubSetWithDifference(int[] arr, int difference) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        int desiredSum = (difference + totalSum) / 2;
        return new CountSubsetWithSum().countSubset(arr, desiredSum, arr.length);
    }
}
