package arrays.search_algorithms.binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {-87, -58, -23, 2, 5, 63, 94, 99, 135, 189};
        int[] arr2 = {157, 100, 65, 52, 37, 24, 18, -4, -36, -58, -88};
        int target1 = 94;
        int target2 = 65;
        int index1 = orderAgnosticBS(arr1, target1);
        System.out.println("[arr1]:  Index of " + target1 + " is " + index1);
        int index2 = orderAgnosticBS(arr2, target2);
        System.out.println("[arr2]: Index of " + target2 + " is " + index2);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
//            int middle = (start + end) / 2; // The value "start + end" might exceed the maximum possible integer value
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAscending) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
