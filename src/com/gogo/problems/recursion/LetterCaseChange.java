package com.gogo.problems.recursion;

public class LetterCaseChange {
    /*
    * Similar to PermutationWithCaseChange
    * however not sure if the given input will always be lowercase
    * also digits are included
    *
    * eg. for input as "a1B2"
    * output shall be
    * a1b2
    * a1B2
    * A1b2
    * A1B2
    * */

    public static void main(String[] args) {
        String input = "a1B2";
        String output = "";
        solve(input, output);
    }

    private static void solve(String input, String output) {
        if(input.equals("")){
            System.out.println(output);
            return;
        }
        if(Character.isDigit(input.charAt(0))){
            solve(new StringBuffer(input).delete(0,1).toString(),output + input.charAt(0));
        }else{
            String op1 = output + input.charAt(0);
            String op2 = output + caseChange(input.charAt(0));
            String ip = new StringBuffer(input).delete(0,1).toString();
            solve(ip, op1);
            solve(ip, op2);
        }
    }

    private static String caseChange(char ch) {
        if(!Character.isDigit(ch)){
            if(Character.isUpperCase(ch)){
                return "" + Character.toLowerCase(ch);
            }else{
                return "" + Character.toUpperCase(ch);
            }
        }
        return "" + ch;
    }
}
