package com.gogo.problems.sorting;

public class SelectionSort implements Sorter {
    /*
     * 5 4 3 2 1
     *
     * find the smallest item and place it ahead
     * 1 4 3 2 5
     * 1 2 3 4 5
     * */

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lowest = arr[i];
            int lowestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (lowest > arr[j]) {
                    lowest = arr[j];
                    lowestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = lowest;
            arr[lowestIndex] = temp;
        }
        return arr;
    }
}
