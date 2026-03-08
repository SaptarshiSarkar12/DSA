package maths.bitwise.questions;

/**
 * Question: Given an integer n, find the position of the rightmost set bit in its binary representation.
 */
public class RightmostSetBit {
    public static void main(String[] args) {
        int n = 18; // 10010 in binary
        int position = rightmostSetBit(n);
        System.out.println("The position of the rightmost set bit in " + n + " is: " + position);
    }

    static int rightmostSetBit(int n) {
        // n & -n gives us the rightmost set bit in n
        // Because -n is the two's complement of n, which is obtained by inverting all bits of n and adding 1
        // Adding 1 to the inverted bits will set the rightmost set bit and clear all bits to the right of it
        int rightmostSetBit = n & -n;
        // To find the position of the rightmost set bit, we can use Integer.numberOfTrailingZeros
        return (int) (Math.log(rightmostSetBit) / Math.log(2)) + 1; // Adding 1 to convert from 0-based index to 1-based position
    }
}
