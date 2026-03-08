package maths.bitwise.questions;

/**
 * Question: Given a number n and an index i, clear the ith bit of n.
 */
public class ClearIthBit {
    public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int i = 0; // We want to clear the least significant bit (0th bit)
        int result = clearIthBit(n, i);
        System.out.println("Result after clearing the " + i + "th bit: " + result); // Should print 4 (0100 in binary)
    }

    static int clearIthBit(int n, int i) {
        int mask = ~(1 << i); // Create a mask with all bits set to 1 except the ith bit
        return n & mask; // Use bitwise AND to clear the ith bit of n
    }
}
