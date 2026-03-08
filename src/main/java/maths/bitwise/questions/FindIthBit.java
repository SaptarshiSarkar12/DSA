package maths.bitwise.questions;

/**
 * Question: Given an integer n and a position i, find the value of the ith bit in the binary representation of n.
 * The bits are 1-indexed from the rightmost bit (least significant bit).
 * For example, if n = 7 (which is 111 in binary) and i = 2, the 2nd bit from the right is 1.
 */
public class FindIthBit {
    public static void main(String[] args) {
        int n = 7; // 111 in binary
        int i = 2; // We want to find the 2nd bit
        int bit = findIthBit(n, i);
        System.out.println("The " + i + "th bit of " + n + " is: " + bit);
    }

    static int findIthBit(int n, int i) {
        int mask = 1 << (i - 1); // Shift 1 to the 2nd position
        return (n & mask);
    }
}
