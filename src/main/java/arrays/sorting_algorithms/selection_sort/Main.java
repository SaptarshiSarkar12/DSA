package arrays.sorting_algorithms.selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSortUsingMaxElement(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int[] arr2 = {89, 45, 68, 90, 29, 34};
        selectionSortUsingMinElement(arr2);
        System.out.println("Sorted array: " + Arrays.toString(arr2));
    }

    static void selectionSortUsingMaxElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // find the maximum element in unsorted part of the array and swap it with correct index
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void selectionSortUsingMinElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // find the smallest number in the unsorted part of the array and swap it with the correct index
            int firstIndex = i;
            int minIndex = getMinIndex(arr, firstIndex, arr.length - 1);
            swap(arr, firstIndex, minIndex);
        }
    }

    private static int getMinIndex(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
