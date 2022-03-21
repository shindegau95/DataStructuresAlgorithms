package com.gogo.problems.recursion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueSubsets {
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        String input = "aab";
        String output = "";
        solve(input, output);
        set = new TreeSet<>(set);
        System.out.println(set);
    }

    private static void solve(String input, String output) {
        if(input.equals("")){
            set.add(output);
            return;
        }
        String op1 = output;
        String op2 = output + input.charAt(0);
        String ip = new StringBuffer(input).delete(0,1).toString();
        solve(ip, op1);
        solve(ip, op2);
    }
}
