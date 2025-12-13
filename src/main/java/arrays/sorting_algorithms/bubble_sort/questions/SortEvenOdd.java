package arrays.sorting_algorithms.bubble_sort.questions;

import java.util.Arrays;

/**
 * Question 1: Sort at even and odd indices of an array.
 * <p>
 *     <a href="https://leetcode.com/problems/sort-even-and-odd-indices-independently/description/">LeetCode Question #2164</a>
 * </p>
 */
public class SortEvenOdd {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 2; j < nums.length - i; j += 2) {
                // even index sorting in ascending order
                if (nums[j] < nums[j - 2]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 2];
                    nums[j - 2] = temp;
                }
            }
            for (int j = 3; j < nums.length - i; j += 2) {
                // odd index sorting in descending order
                if (nums[j] > nums[j - 2]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 2];
                    nums[j - 2] = temp;
                }
            }
        }
        return nums;
    }
}