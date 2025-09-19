package arrays.search_algorithms.binary_search.questions;

/**
 * Question 6
 * <p>
 *     <a href="https://leetcode.com/problems/peak-index-in-a-mountain-array/">Question</a>
 * </p>
 */
public class MountainArray {
    public static void main(String[] args) {
        /*
        Let's take [1, 3, 5, 7, 9, 5, 4, 2] as an example of bitonic array
        Indices ->  0  1  2  3  4  5  6  7
        We can think of these kind of arrays as two sorted arrays joined together. If we apply binary search, then
        start (s) pointer will be at 0, end (e) at 7 and middle (m) at 3 indices.
        We need to find the max number in the array, so, the following are the possibilities are there for the mid-element:
        1. If arr[m] > arr[m+1], means we are in the decreasing part of the array. This might be a potential answer.
           e = mid as we need to check left of mid. No "1" is subtracted because we are not sure whether the previous element
           (arr[m-1]) is greater than arr[m].
        2. If arr[m] < arr[m+1], means we are in the increasing part of the array. This might be a potential answer.
           "s = mid + 1". Here, "1" is added because we know that arr[m+1] is already greater than arr[m].
        3. When will the loop break? In the end, both s and e will point to the largest number.
         */
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
