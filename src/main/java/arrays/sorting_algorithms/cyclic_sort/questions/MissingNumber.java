package arrays.sorting_algorithms.cyclic_sort.questions;

/**
 * Question 1: Find missing number in an array of range 0 to n.
 * <p>
 *     <a href="https://leetcode.com/problems/missing-number/description/">LeetCode Question #268</a>
 * </p>
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            // swap only if the number is in the range of 0 to n-1
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        /*
        For the example input [3,0,1]:
        After sorting, the array becomes [0,1,3].
        We then iterate through the array to find the first index where the value does not match the index.
        At index 2, we find the value 3, which does not match the index 2, indicating that 2 is the missing number.
        Hence, the output is 2.
         */
        // search for missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        // case when n is missing
        return nums.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
