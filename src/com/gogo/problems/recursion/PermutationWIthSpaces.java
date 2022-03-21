package com.gogo.problems.recursion;

public class PermutationWIthSpaces {
    /*
    * Given string "abc"
    * print
    * "a b c", "a bc", "ab c", "abc"
    * */
    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        solve(input, output);
    }

    private static void solve(String input, String output) {
        if(input.equals("")){
            System.out.println(output);
            return;
        }
        if(!output.equals("")){
            String op1 = output + input.charAt(0);
            String op2 = output + " " + input.charAt(0);
            String ip = new StringBuffer(input).delete(0,1).toString();
            solve(ip, op1);
            solve(ip, op2);
        }
        else{
            String op = ""+input.charAt(0);
            String ip = new StringBuffer(input).delete(0,1).toString();
            solve(ip, op);
        }
    }
}
