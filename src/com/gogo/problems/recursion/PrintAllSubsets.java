package com.gogo.problems.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {
    /**
     * Given a string, print all possible subsets
     * eg. for input as "ab"
     * output shall be "", "a", "b", "ab"
     * */
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String input = "aab";
        String output = "";
        solve(input, output);
        System.out.println(list);
    }

    private static void solve(String input, String output) {
        if(input.equals("")){
            list.add(output);
            return;
        }
        String op1 = output;
        String op2 = output + input.charAt(0);
        String ip = new StringBuffer(input).delete(0,1).toString();
        solve(ip, op1);
        solve(ip, op2);
    }
}
