package com.gogo.problems.sorting;

public class InsertionSort implements Sorter {

    /*
     * 5 4 3 2 1
     *
     * 4 5 3 2 1
     * 3 4 5 2 1
     * 2 3 4 5 1
     * 1 2 3 4 5
     * */

    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i--;
                }
            }
        }
        return arr;
    }
}
