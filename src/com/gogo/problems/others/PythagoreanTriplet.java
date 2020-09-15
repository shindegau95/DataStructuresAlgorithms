package com.gogo.problems.others;

import java.util.Arrays;

public class PythagoreanTriplet {
    /*
     * Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2
     * eg.
     * Input: arr[] = {3, 1, 4, 6, 5}
     * Output: True
     *
     * Input: arr[] = {10, 4, 6, 12, 5}
     * Output: False
     * */

    public boolean isTripletPresent(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }

        //sort the array
        Arrays.sort(arr);

        //method1
        //pivot type
        boolean isTriplet = false;
        for (int pivot = arr.length - 1; pivot > 1; pivot--) {
            int low = 0, high = pivot - 1;
            while (low < high) {
                int sum = arr[low] + arr[high];
                if (arr[pivot] == sum) {
                    isTriplet = true;
                    return isTriplet;
                } else if (arr[pivot] > sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return isTriplet;
    }
}
