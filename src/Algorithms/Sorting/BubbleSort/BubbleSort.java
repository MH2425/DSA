package Algorithms.Sorting.BubbleSort;

import java.util.Comparator;

public class BubbleSort {
    public static <E> void bubbleSortAscending(E[] arr, Comparator<E> comp) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (comp.compare(arr[j], arr[j + 1]) > 0) {
                    E temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static <E> void bubbleSortDescending(E[] arr, Comparator<E> comp) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (comp.compare(arr[j], arr[j + 1]) < 0) {
                    E temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 4, 2};
        bubbleSortAscending(intArray, Integer::compareTo);
        System.out.println("Sorted Integer Array:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        bubbleSortDescending(intArray, Integer::compareTo);
        System.out.println("Sorted Integer Array:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        String[] strArray = {"Banana", "Apple", "Mango", "Pineapple", "AAA"};
        bubbleSortAscending(strArray, String::compareTo);
        System.out.println("\nSorted String Array:");
        for (String str : strArray) {
            System.out.print(str + " ");
        }

        bubbleSortDescending(strArray, String::compareTo);
        System.out.println("\nSorted String Array:");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
