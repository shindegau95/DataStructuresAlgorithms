package com.gogo.problems.dynamicProgramming.ZeroOne.classic;

public class ZeroOneKnapsackTopDown {
    public static void main(String[] args) {
        int n = 4;
        int[] wt = new int[]{1, 3, 4, 5};
        int[] val = new int[]{1, 4, 5, 7};
        int c = 7;

        int[][] t = new int[n+1][c+1];
        //initialization
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if(i==0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }

        //preprocess
        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[i].length; j++) {
                if(wt[i-1]<=j){
                    int included = val[i-1] + t[i-1][j-wt[i-1]];
                    int excluded = t[i-1][c];
                    t[i][j] = Math.max(included, excluded);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        int maxProfit = t[n][c];
        System.out.println("maxProfit = " + maxProfit);
    }

}
