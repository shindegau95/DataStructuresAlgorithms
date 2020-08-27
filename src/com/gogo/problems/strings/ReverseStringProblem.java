package com.gogo.problems.strings;

public class ReverseStringProblem {
    //create a function that reverses string
    public static String reverseString(String input) {
        if (input == null) {
            throw new NullPointerException();
        } else if (input.length() == 1) {
            return input;
        }
        int length = input.length();
        char[] reverseChars = new char[length];
        for (int i = 0; i < length; i++) {
            reverseChars[length - i - 1] = input.charAt(i);
        }
        return String.copyValueOf(reverseChars);
    }
}
