package maths.bitwise.questions;

/**
 * Question: Given a number n and an index i, set the ith bit of n to 1.
 */
public class SetIthBit {
    public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int i = 2; // We want to set the 2nd bit
        int result = setIthBit(n, i);
        System.out.println("Result after setting the " + i + "th bit: " + result); // Should print 7 (0111 in binary)
    }

    static int setIthBit(int n, int i) {
        int mask = 1 << (i - 1); // Create a mask with the ith bit set to 1
        return n | mask; // Use bitwise OR to set the ith bit of n to 1
    }
}
