package com.gogo.problems.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SorterTest {

    Sorter sorter;
    int[] arr;

    @BeforeEach
    void setUp() {
        arr = new int[]{5, 4, 3, 2, 1};
    }

    @Test
    void bubbleSort() {
        sorter = new BubbleSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void selectSort() {
        sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void insertSort() {
        sorter = new InsertionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void mergeSort() {
        sorter = new MergeSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sorter.sort(arr));
    }

    @Test
    void quickSort() {
        sorter = new QuickSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sorter.sort(arr));
    }
}