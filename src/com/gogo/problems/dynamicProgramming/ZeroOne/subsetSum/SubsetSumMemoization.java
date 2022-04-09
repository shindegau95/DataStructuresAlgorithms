package com.gogo.problems.dynamicProgramming.ZeroOne.subsetSum;

public class SubsetSumMemoization {
    static Boolean[][] t = new Boolean[6][12];
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,7,8,10};
        int sum = 11;

        //intialization
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if(i == 0){
                    t[i][j] = false;
                }if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        boolean isSumPossible = solve(arr, sum, arr.length-1);
        System.out.println("isSumPossible = " + isSumPossible);
    }

    private static boolean solve(int[] arr, int sum, int n) {
        if(t[n][sum] != null){
            return t[n][sum];
        }else{
            if(arr[n-1] <= sum){
                boolean included = solve(arr, sum-arr[n-1], n-1);
                boolean excluded = solve(arr, sum, n-1);
                t[n][sum] = included || excluded;
            }else{
                t[n][sum] = solve(arr, sum, n-1);
            }
            return t[n][sum];
        }
    }
}
