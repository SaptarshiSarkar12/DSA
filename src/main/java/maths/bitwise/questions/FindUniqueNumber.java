package maths.bitwise.questions;

/**
 * Question: Given an array of integers, all the numbers are repeated twice except one. Find the number that is repeated once.
 */
public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int result = findSingleNumber(arr);
        System.out.println("The number that is repeated once is: " + result);
    }

    static int findSingleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR operation
        }
        return result;
    }
}
