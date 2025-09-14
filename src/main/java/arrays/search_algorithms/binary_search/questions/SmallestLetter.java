package arrays.search_algorithms.binary_search.questions;

/**
 * Question 3: Ceiling of a letter.
 * <p>
 * <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/">LeetCode Question #744</a>
 * </p>
 */
public class SmallestLetter {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
        // Suppose that the target letter is not present in the array, then the start pointer will be at index "end + 1"
        // i.e. equal to the length of the array. In that case, we need to return 0th index (solved by "start % length")
        // For other cases, when the smallest letter larger than the target is found, then modulo will just return the index of that number.
    }
}
