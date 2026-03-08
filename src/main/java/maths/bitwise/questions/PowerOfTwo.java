package maths.bitwise.questions;

/**
 * Question: Check if a number is a power of two.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println("Is " + n + " a power of two? " + isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Returns false for non-positive numbers, as powers of two are positive integers
        }
        return (n & (n - 1)) == 0; // Returns true if n is a power of two, false otherwise
    }
}
