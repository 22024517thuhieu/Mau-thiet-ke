package org.example;

public class Array {

    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    public void sort(Strategy strategy) {
        strategy.sort(arr);
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
