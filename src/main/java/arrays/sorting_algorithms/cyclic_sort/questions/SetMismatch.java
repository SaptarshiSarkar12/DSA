package arrays.sorting_algorithms.cyclic_sort.questions;

import java.util.Arrays;

/**
 * Question 5: Find the duplicate and missing number in an array of length n from numbers of range 1 to n.
 * <p>
 *     <a href="https://leetcode.com/problems/set-mismatch/">LeetCode Question #645</a>
 * </p>
 */
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] result = findErrorNums(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                // nums[index] is the duplicate number
                // index + 1 is the missing number
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
