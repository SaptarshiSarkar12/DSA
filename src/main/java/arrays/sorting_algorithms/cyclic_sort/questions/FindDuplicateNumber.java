package arrays.sorting_algorithms.cyclic_sort.questions;

/**
 * Question 3: Find the duplicate number in an array of length n+1 from numbers of range 1 to n.
 * <p>
 *     <a href="https://leetcode.com/problems/find-the-duplicate-number/">LeetCode Question #287</a>
 * </p>
 */
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        // the array contains n+1 elements with numbers ranging from 1 to n
        // hence at least one duplicate is guaranteed
        // the duplicate number takes the place of missing number in cyclic sort
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i]; // Duplicate found
                }
            } else {
                i++;
            }
        }
        return -1; // No duplicate found
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
