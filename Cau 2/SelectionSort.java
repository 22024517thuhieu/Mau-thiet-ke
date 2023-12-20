package org.example;

public class SelectionSort extends Strategy {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = findMin(arr, i);
            if (min != i) {
                swap(arr, i, min);
            }
        }
    }

    private int findMin(int[] arr, int start) {
        int min = start;
        for (int j = start + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        return min;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
