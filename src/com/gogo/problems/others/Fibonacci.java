package com.gogo.problems.others;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    //return fibonacci for a number
    // sequence is like 1 1 2 3 5

    public int getFibonacciRecursive(int n) {
        if (n < 2) {
            return n;
        } else {
            return getFibonacciRecursive(n - 1) + getFibonacciRecursive(n - 2);
        }
    }

    public int getFibonacciIterative(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i++) {
            int num = list.get(i - 1) + list.get(i - 2);
            list.add(num);
        }
        return list.get(n);
    }
}
