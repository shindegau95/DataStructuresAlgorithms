package com.gogo.problems.recursion;

public class PermutationWIthCaseChange {
    /*
    * Input is lower case string like "ab"
    * Output shall be "ab", "aB", "Ab", "AB"
    * */

    public static void main(String[] args) {
        String input = "ab";
        String output = "";
        solve(input, output);
    }

    private static void solve(String input, String output) {
        if(input.equals("")){
            System.out.println(output);
            return;
        }
        String op1 = output + input.charAt(0);
        String op2 = output + Character.toUpperCase(input.charAt(0));
        String ip = new StringBuffer(input).delete(0,1).toString();
        solve(ip, op1);
        solve(ip, op2);
    }
}
