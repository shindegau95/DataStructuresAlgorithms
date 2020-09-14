package com.gogo.problems.sorting;

public class QuickSort implements Sorter {
    /*
     * pivot sorting
     * select pivot
     * everything to the left shall be < pivot and to the right shall be > pivot
     * once done do same for left and for right
     * */

    @Override
    public int[] sort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = high;
            int pi = partition(arr, low, high, pivot);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    private int partition(int[] arr, int low, int high, int pivot) {
        while (low < high) {
            while (arr[low] < arr[pivot]) {
                low++;
            }

            while (arr[high] > arr[pivot]) {
                high--;
            }

            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            } else {
                break;
            }
        }

        int temp = arr[pivot];
        arr[pivot] = arr[low];
        arr[low] = temp;
        return low;
    }


}
