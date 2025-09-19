package arrays.search_algorithms.binary_search.questions;

/**
 * Question 7
 * <p>
 *     <a href="https://leetcode.com/problems/find-in-mountain-array/">Question</a>
 * </p>
 */
public class SearchInMountain {
    public static void main(String[] args) {
        /*
        1. Find peak element.
        2. Binary search in asc part of array as min index of occurrence was asked.
        3. If not found, binary search in desc part of array
         */
    }

    public int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int tryInAsc = orderAgnosticBS(arr, target, 0, peak);
        if (tryInAsc != -1) {
            return tryInAsc;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    public int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
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

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // you are in the asc part of array
                // Because we know that mid+1 element > mid element
                start = mid + 1;
            } else {
                // you are in the dec part of array
                // this may be the ans, but check left side
                // this is why end != mid - 1
                end = mid;
            }
        }
        // In the end, start == end and pointing to the largest number because of the above 2 checks
        // start and end are always trying to find the max element in the above 2 checks.
        // Hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // At every point of time for start and end, they have the best possible answer till that time
        // and if we're saying that only one item is remaining, hence cuz of the above line that is the best possible answer.
        return start;
    }
}
