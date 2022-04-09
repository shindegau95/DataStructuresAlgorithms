package com.gogo.problems.dynamicProgramming.ZeroOne.subsetSum;

public class SubsetSumRecursive {
    /*
     *
     * Input
     * arr[] = {2,3,7,8,10}
     * sum = 11
     *
     * Output true or false - i.e. is the sum possible or no
     * */

    /*
     * Brute force,
     * here there are items, we can either choose that item or not
     * we reach a solution if sum is met,
     * */

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 7, 8, 10};
        int sum = 11;
        boolean isSumPossible = solve(arr, sum, arr.length - 1);
        System.out.println("isSumPossible = " + isSumPossible);
    }

    public static boolean solve(int[] arr, int sum, int n) {
        if (n == 0) {
            if (sum == 0) {
                return true;
            } else {
                return false;
            }
        }
        if (arr[n] <= sum) {
            boolean included = solve(arr, sum - arr[n], n - 1);
            boolean excluded = solve(arr, sum, n - 1);
            return included || excluded;
        } else {
            return solve(arr, sum, n - 1);
        }
    }
}
