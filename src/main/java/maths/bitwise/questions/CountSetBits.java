package maths.bitwise.questions;

/**
 * Question: Count the number of set bits in a given integer.
 */
public class CountSetBits {
    public static void main(String[] args) {
        int n = 9; // 1001 in binary
        int count = countSetBits2(n);
        System.out.println("Number of set bits in " + n + " is: " + count);
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1; // Increment count if the least significant bit is set
            n >>= 1; // Right shift n by 1 to check the next bit
        }
        return count;
    }

    // Optimized approach using Brian Kernighan's algorithm
    static int countSetBits2(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1); // Clear the least significant bit set
            count++; // Increment count for each set bit found
        }

        // Another way to clear the least significant bit set is to use n & -n, which gives us the value of the least significant bit set. We can then subtract this value from n to clear it.
//        while (n > 0) {
//           n -= n & -n; // Clear the least significant bit set
//           count++; // Increment count for each set bit found
//        }
        return count;
    }
}