package com.gogo.problems.dynamicProgramming.ZeroOne.subsetSum;

public class SubsetSumTopDown {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,7,8,10};
        int sum = 11;
        boolean[][] t = new boolean[arr.length + 1][sum + 1];

        //initialization
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if(i==0){
                    t[i][j] = false;
                }
                if(j==0){
                    t[i][j] = true;
                }
            }
        }

        //preprocessing
        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[i].length; j++) {
                if(arr[i-1] <= j){
                    boolean included = t[i-1][j-arr[i-1]];
                    boolean excluded = t[i-1][j];
                    t[i][j] = included || excluded;
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        boolean isSubsetSumPossible = t[arr.length][sum];
        System.out.println("isSubsetSumPossible = " + isSubsetSumPossible);
    }
}
