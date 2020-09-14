package com.gogo.problems.sorting;

public class BubbleSort implements Sorter {

    /*
     * 5 4 3 2 1
     * 4 5 3 2 1
     * 4 3 5 2 1
     * 4 3 2 5 1
     * 4 3 2 1 5
     *
     * 3 4 2 1 5
     * 3 2 4 1 5
     * 3 2 1 4 5
     *
     * 2 3 1 4 5
     * 2 1 3 4 5
     *
     * 1 2 3 4 5
     * */

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
