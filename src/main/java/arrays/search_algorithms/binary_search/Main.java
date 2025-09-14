package arrays.search_algorithms.binary_search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-87, -58, -23, 2, 5, 63, 94, 99, 135, 189};
        int target = 4;
        int index = binarySearch(arr, target);
        System.out.println("Index of " + target + " is " + index);
    }

    // return the index
    // return -1 if the element does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
//            int middle = (start + end) / 2; // The value "start + end" might exceed the maximum possible integer value
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
