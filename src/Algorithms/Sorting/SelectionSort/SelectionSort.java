package Algorithms.Sorting.SelectionSort;

import java.util.ArrayList;

public class SelectionSort {
    public static void selectionSortAscending(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            int temp = arr[minValueIndex];
            arr[minValueIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 11, 8, 9, 10};
        selectionSortAscending(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
