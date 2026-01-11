package arrays.sorting_algorithms.cyclic_sort.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 2: Find all the missing numbers in an array of length n from numbers of range 1 to n.
 * <p>
 *     <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">LeetCode Question #448</a>
 * </p>
 */
public class AllDisappearedNumbers {
    public static void main(String[] args) {
        /*
        As the array length is n and the numbers are in the range 1 to n,
        we can use cyclic sort to place each number at its correct index (number - 1).
        After sorting, we can iterate through the array to find the indices where the numbers do not match the expected values.
        These indices + 1 will give us the missing numbers.
         */
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        /*
        Cyclic Sort for [4,3,2,7,8,2,3,1]:
        1. i=0: correctIndex=3, swap(0,3) -> [7,3,2,4,8,2,3,1]
        2. i=0: correctIndex=6, swap(0,6) -> [3,3,2,4,8,2,7,1]
        3. i=0: correctIndex=2, swap(0,2) -> [2,3,3,4,8,2,7,1]
        4. i=0: correctIndex=1, swap(0,1) -> [3,2,3,4,8,2,7,1]
        5. i=0: correctIndex=2, no swap as nums[0] == nums[2], i++
        6. i=1: correctIndex=1, i++
        7. i=2: correctIndex=2, i++
        8. i=3: correctIndex=3, i++
        9. i=4: correctIndex=7, swap(4,7) -> [3,2,3,4,1,2,7,8]
        10. i=4: correctIndex=0, swap(4,0) -> [1,2,3,4,3,2,7,8]
        11. i=4: correctIndex=2, no swap as nums[4] == nums[2], i++
        12. i=5: correctIndex=1, no swap as nums[5] == nums[1], i++
        13. i=6: correctIndex=6, i++
        14. i=7: correctIndex=7, i++
        After sorting, the array becomes [1,2,3,4,3,2,7,8].
        Now, we check for indices where nums[i] != i + 1:
        - i=4: nums[4] = 3 != 5 -> missing number 5
        - i=5: nums[5] = 2 != 6 -> missing number 6
        Thus, the output is [5, 6].
         */
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                missingNumbers.add(index + 1);
            }
        }
        return missingNumbers;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
