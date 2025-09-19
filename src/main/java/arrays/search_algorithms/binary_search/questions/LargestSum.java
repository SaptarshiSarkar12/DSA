package arrays.search_algorithms.binary_search.questions;

/**
 * Question 10: Split Array Largest Sum
 * <p>
 *     <a href="https://leetcode.com/problems/split-array-largest-sum/description/">Question</a>
 * </p>
 */
public class LargestSum {
    public static void main(String[] args) {
        /*
        Let's take arr=[7, 2, 5, 10, 8] as an example array and k=2 (which means split into 2 parts)
        Possible partitions:
        1. [7, 2, 5, 10], [8] =Sum=> 24, 8 =Largest=> 24
        2. [7, 2, 5], [10, 8] =Sum=> 14, 18 =Largest=> 18
        3. [7, 2], [5, 10, 8] =Sum=> 9, 23 =Largest=> 23
        4. [7], [2, 5, 10, 8] =Sum=> 7, 25 =Largest=> 25
        We have to minimize the largest sum among these sub-arrays. So, the minimum sum is 18 which is the answer.
        One approach is to use the brute force method. That's a very messy solution.
        Let's think differently:
        Case1: Min. number of partitions that we can make = 1
        Case2: Max. number of partitions that we can make = N (where N is the number of elements in the array)

        What will be the answer in the case of Case1? It would be the sum of the entire array!
        In case2, each subarray corresponds to each single elements in the array, so, the answer would be the largest element.
        Max. value of ans. of question = case1 = sum of all values in array = 32
        Min. value of ans. of question = case2 = max. value in array = 10
        So, sum will lie in the range of [10, 32]. Here, it clicked that we'll apply binary search.
        Now, we'll apply binary search. Mid = 21 => this might be a potential answer, let's try to split the array with 21 as the max sum.
        First taking 7. Is 7+2=9 < 21? Yes. Add it.
        So, after checking the sum condition everytime, we can split the array into:
        [7, 2, 5], [8, 10]
        Total no. of pieces = 2. So, we'll check if (pieces <= k)?
        If pieces < k, we'll need to reduce the required sum to increase the number of pieces.
        So, "end = mid" instead of "end = mid - 1" as pieces might be equal to k.

        start = 10, end = 21
        mid = 15
        We'll again create sub-arrays:
        [7, 2, 5], [8], [10]
        Total pieces = 3
        Now, pieces is greater than k, so, we'll need to take a bigger sum.
        "start = mid + 1".
        Hence, start = 16, end = 21
        mid = 18
        Possible sub-arrays: [7, 2, 5], [8, 10]
        Now, again pieces <= k, so end = mid = 18
        Hence, start = 16, end = 18
        mid = 17
        Possibilities: [7, 2, 5], [8], [10] => Pieces = 3
        So, start = mid + 1 = 18, end = 18 and mid = 18
        When start = end, no new answer is possible. Only the correct answer will be achieved at that point because of
        the two checks.

        Because we have a range of potential answers, we applied binary search here
         */
    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // In the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1; // min. 1 piece
            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make a new one
                    // say you add this num in new subarray, then sum = num
                    // Like for mid=18, possible: [7, 2, 5] we can't add 8 here as it would exceed 18 as total sum
                    // as an iteration of numbers are going on here, "num=8" case won't come next time, so we count it
                    // as new sum for the new array (or next subarray)
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // here start == end
    }
}
