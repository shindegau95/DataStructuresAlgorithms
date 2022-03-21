package com.gogo.problems.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateAllBalancedParanthesis {
    /*
     * Given input n = 2
     * permutations of balanced paranthesis will be
     * (())
     * ()()
     * */

    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        int n = 3;
        int c = 3; //open
        int o = 3; //close
        String output = "";
        solve(c, o, output);
        System.out.println(set);
    }

    private static void solve(int c, int o, String output) {
        if (c == o && o == 0){
            set.add(output);
            return;
        }
        if(o != 0){
            String op1 = output + "(";
            solve(c, o-1, op1);
        }
        if(c > o){
             String op2 = output + ")";
             solve(c-1, o, op2);
        }
    }
}
