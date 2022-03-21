package com.gogo.problems.recursion;

public class TowerOFHanoi {
    /**
     * Given n plates, move them from src to dest such that
     * 1) plates can be picked only one at a time
     * 2) only lighter ones can be placed over the heavy
     * */

    public static void main(String[] args) {
        int n = 3;
        int src = 1;
        int dest = 3;
        int helper = 2;
        solve(n, src, dest, helper);
    }

    private static void solve(int n, int src, int dest, int helper) {
        if(n==1){
            System.out.println("Move plate " + n + " from " + src + " to " + dest);
            return;
        }
        solve(n-1, src, helper, dest);
        System.out.println("Move plate " + n + " from " + src + " to " + dest);
        solve(n-1, helper, dest, src);
    }
}
