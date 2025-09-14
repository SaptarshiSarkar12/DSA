package arrays.search_algorithms.binary_search.questions;

/**
 * Question 2: Floor of a number
 */
public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ceil = floor(arr, target);
        System.out.println("Index of floor of " + target + " is " + ceil);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        /*
        Check Ceiling problem's comment. The difference here is that arr[start] > arr[end] in ascending order sorted array.
        So, floor of the target number will be arr[end].
         */

        return end; // Will work even when target is less than first element of the array because in that case,
        // end pointer will move to the left of the array attaining an index value of -1.
    }
}
