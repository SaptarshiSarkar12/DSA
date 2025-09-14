package arrays.search_algorithms.binary_search.questions;

/**
 * Question 4: First and Last Position of Element
 * <p>
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/">LeetCode Question #34</a>
 * </p>
 */
public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Check for first occurrence of target
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            // Check for last occurrence of target
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < nums[middle]) {
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                // potential answer found
                ans = middle;
                if (findStartIndex) {
                    end = middle - 1;
                } else  {
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
