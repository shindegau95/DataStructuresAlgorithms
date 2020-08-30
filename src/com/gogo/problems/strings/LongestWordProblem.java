package com.gogo.problems.strings;

import java.util.Scanner;

public class LongestWordProblem {

    /**
     * Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string
     * Input: "fun&!! time"
     * Output: time
     * <p>
     * Input: "I love dogs"
     * Output: love
     */

    //using strings
    public static String getLongestWord(String sentence) {
        Scanner scanner = new Scanner(sentence);
        scanner.useDelimiter("[^a-zA-Z\\d:]");
        int maxLength = Integer.MIN_VALUE;
        String longestWord = "";
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }
}
