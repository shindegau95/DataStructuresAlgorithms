package com.gogo.problems.dynamicProgramming.ZeroOne.classic;

public class ZeroOneKnapsackRecursive {
    public static void main(String[] args) {
        int n = 4;
        int[] wt = new int[]{1, 3, 4, 5};
        int[] val = new int[]{1, 4, 5, 7};
        int c = 7;
        int maxProfit = knapsack(wt, val, c, n);
        System.out.println("maxProfit = " + maxProfit);
    }

    private static int knapsack(int[] wt, int[] val, int c, int n) {
        //base condition
        if (n == 0 || c == 0) {
            return 0;
        }

        //choice
        if(wt[n-1] <= c){
            int included = val[n-1] + knapsack(wt, val, c-wt[n-1], n-1);
            int excluded = knapsack(wt, val, c, n-1);
            return Math.max(included, excluded);
        }else{
            return knapsack(wt, val, c, n-1);
        }
    }
}
