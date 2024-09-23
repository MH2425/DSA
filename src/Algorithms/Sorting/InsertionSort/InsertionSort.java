package Algorithms.Sorting.InsertionSort;

import java.util.Comparator;

public class InsertionSort {
    public static void insertionSortAscending(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;

            while ((j >= 0) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionSortDescending(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;

            while ((j >= 0) && (arr[j] < key)) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static <E> void insertionSortAscendingGeneric(E[] arr, Comparator<E> comparator) {
        int size = arr.length;
        for (int i = 0; i < size; ++i) {
            E key = arr[i];
            int j = i - 1;

            while ((j >= 0) && ((comparator.compare(arr[j], key) > 0))) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {12, 11, 13, 5, 6};
//        insertionSortAscending(arr);
//        insertionSortDescending(arr);
        insertionSortAscendingGeneric(arr, Integer::compareTo);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
