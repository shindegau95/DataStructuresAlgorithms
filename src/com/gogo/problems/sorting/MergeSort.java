package com.gogo.problems.sorting;

import java.util.Arrays;

public class MergeSort implements Sorter {
    /*
     * 4 3 2 1
     *
     * 4 3 | 2 1
     * 4 | 3 || 2 | 1
     * 3 4 | 1 2
     * 1 2 3 4
     * */

    @Override
    public int[] sort(int[] arr) {
        arr = mergeSort(arr);
        return arr;
    }

    private int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        return merge(
                mergeSort(left),
                mergeSort(right)
        );
    }

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int k = 0, i = 0, j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }
        return merged;
    }


}
