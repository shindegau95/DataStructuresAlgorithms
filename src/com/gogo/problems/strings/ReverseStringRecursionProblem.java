package com.gogo.problems.strings;

public class ReverseStringRecursionProblem {

    public String reverseString(String s) {
        if (s.equals("")) {
            return "";
        } else {
            return reverseString(s.substring(1)) + s.substring(0, 1);
        }
    }
}
