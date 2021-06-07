package com.gogo.problems.others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    //O(n^2)
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

        /*
         * 1 3 4 5 6
         * 1 9 16 25 36
         * pivot = 36
         * low = 1
         * high = 25
         *
         * */
    }

    //O(nlogn)
    public boolean isTripletPresentOptimal(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        int c = arr.length - 1, b = arr.length - 2, a = arr.length - 3;
        while (a >= 0 && b > 0 && c > 1) {
            if (b == a) {
                a--;
            }
            if (arr[b] + arr[a] > arr[c]) {
                a--;
            } else if (arr[c] == arr[b] + arr[a]) {
                return true;
            } else {
                //c>a+b
                c--;
                b--;
            }
        }
        return false;
    }

    //O(n^2)
    public boolean isTripletPresentHashing(int[] arr){
        //create hashset & add squares of numbers
        Set<Integer> arrSet = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) Math.pow(arr[i], 2);
            arrSet.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                //if arrSet contains a^2+b^2, then element found
                if(i != j && arrSet.contains(arr[i]+arr[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
