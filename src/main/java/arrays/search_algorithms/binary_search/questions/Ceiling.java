package arrays.search_algorithms.binary_search.questions;

/**
 * Question 1: Ceiling of a number
 */
public class Ceiling {
    public static void main(String[] args) {
        /*
        Ceiling means the smallest element in the array which is greater than or equal to the target element.
        Array is [2, 3, 5, 9, 14, 16, 18] and let's say target element is 14.
        Ceiling of 14 in the array will be 14 ("Equal to" case).
        If the target element is 15, then floor will be 16 ("Greater than" case).
        If only "equal to" case was asked in this question, then isn't it a binary search question?
         */
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ceil = ceiling(arr, target);
        System.out.println("Index of floor of " + target + " is " + ceil);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[end] < target) {
            return -1;
        }

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
        When the while loop was running, the target must have been within (or equal to) start and end pointers.

        The while loop's condition will be violated when "end > start". If the target element did not lie between
        the start and the end pointers, then it must be lying somewhere outside the end pointer. After the while loop condition
        gets violated, start will come after end and in ascending order sorted array, arr[start] > arr[end].
        We can imagine the target to lie somewhere between the end and the start pointer. So, the element greater than
        the target would be arr[start].

        For example, in the given array, if target element was 15, then the second last case before while loop violation would be:
        arr[s]: 14        arr[m]: 16        arr[e]: 18
        Then,
        s, m and e will point to the same element i.e. 14.
        Then,
        arr[e (or m)]: 14        arr[s]: 16   => s>e -> so condition violated
        Now, we can imagine that "15" will lie between end and start pointers, and we need to find the number greater than the target
        so, start pointer must be the answer and arr[s] will be its value.
         */

        return start; // Instead of returning -1 when target doesn't exist in the array
    }
}
