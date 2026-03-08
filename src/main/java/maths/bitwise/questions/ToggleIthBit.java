package maths.bitwise.questions;

/**
 * Question: Toggle the ith bit of a number.
 */
public class ToggleIthBit {
    public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int i = 1; // Toggle the 1st bit (0-based index)
        int result = toggleIthBit(n, i);
        System.out.println("Original number: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("After toggling the " + i + "th bit: " + result + " (binary: " + Integer.toBinaryString(result) + ")");
    }

    static int toggleIthBit(int n, int i) {
        int mask = 1 << i; // Create a mask with the ith bit set to 1
        return n ^ mask; // Toggle the ith bit using XOR
    }
}
