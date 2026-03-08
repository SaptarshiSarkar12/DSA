package maths.bitwise.questions;

/**
 * Question: Given an array of integers where every element appears three times except for one, which appears exactly once.
 * Find the single element that appears only once.
 */
public class FindUniqueNumberThrice {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2};
        System.out.println(findUnique(arr)); // Output: 3
    }

    static int findUnique(int[] arr) {
        int result = 0;
        for (int i = 0; i < 32; i++) { // Iterate through each bit position
            int count = 0;
            for (int num : arr) {
                if ((num & (1 << i)) != 0) { // Check if the i-th bit is set
                    count++;
                }
            }
            if (count % 3 != 0) { // If the count of set bits at this position is not a multiple of 3, it means the unique number has this bit set
                result |= (1 << i); // Set the i-th bit in the result
            }
        }
        return result;
    }
}
