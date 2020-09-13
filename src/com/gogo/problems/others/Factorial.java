package com.gogo.problems.others;

public class Factorial {

    //Find the factorial for a number
    //5! = 5*4*3*2*1 = 120

    //Recursive
    public int findFactorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * findFactorialRecursive(n - 1);
        }
    }

    //iterative
    public int findFactorialIterative(int n) {
        if (n == 1) {
            return 1;
        } else {
            int prod = 1;
            for (int i = 2; i <= n; i++) {
                prod = prod * i;
            }
            return prod;
        }
    }

}
