package arrays.sorting_algorithms.cyclic_sort.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 4: Find all duplicate numbers in an array of length n from numbers of range 1 to n.
 * <p>
 *     <a href="https://leetcode.com/problems/find-all-duplicates-in-an-array/">LeetCode Question #442</a>
 * </p>
 */
public class AllDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
