package com.gogo.problems.others;

public class MissingDuplicateSum {

    /*
     * Ideally the array shall contain elements from 1 to n
     * eg. n - 5
     * expected -> {1, 2, 3, 4, 5}
     *
     * Given {4, 3, 1, 5, 4}
     * there is one duplicate -> 4 and one missing -> 2
     * */

    //simple way
    /*
     * Using Maths
     * {a,d,c,d,e}
     *
     * this expected sum - actual sum
     * = (a + b + c + d + e) - (a + d + c + d + e)
     * = b - d
     *
     * this expected sum square - actual sumsquare
     * = (a^2 + b^2 + c^2 + d^2 + e^2) - (a^2 + d^2 + c^2 + d^2 + e^2)
     * = b^2 - d^2
     *
     * divide (2) by (1)
     * b + d
     *
     * solve this again with (1)
     * then you will get both b and e where b is missing and e is duplicate
     * */
    public void findDuplicateAndMissing(int[] arr) {
        //get normal array sum till n
        int expectedSum = 0;
        int expectedSquareSum = 0;
        int actualSum = 0;
        int actualSquareSum = 0;

        for (int i = 0; i < arr.length; i++) {
            expectedSum += i + 1;
            expectedSquareSum += Math.pow(i + 1, 2);
            actualSum += arr[i];
            actualSquareSum += Math.pow(arr[i], 2);
        }

        int eq1 = expectedSum - actualSum;
        int eq2 = (expectedSquareSum - actualSquareSum) / eq1;

        int missing = (eq1 + eq2) / 2;
        int duplicate = (eq2 - eq1) / 2;

        System.out.println("Missing : " + missing);
        System.out.println("Duplicate : " + duplicate);
    }

}
