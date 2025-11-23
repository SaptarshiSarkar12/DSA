package arrays.sorting_algorithms.bubble_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 8, 3, -45, 0, 34, 12};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped = false;
        // run the outer loop for n-1 passes
        for (int i = 0; i < arr.length - 1; i++) {
            // In each subsequent pass, the largest element comes at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular pass, it means the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
