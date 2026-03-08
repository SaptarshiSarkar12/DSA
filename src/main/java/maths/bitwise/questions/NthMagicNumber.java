package maths.bitwise.questions;

/**
 * Question: Find the Nth magic number. A magic number is a number that can be expressed as a sum of distinct powers of 5. The first few magic numbers are:
 * 1 (5^0), 5 (5^1), 6 (5^0 + 5^1), 25 (5^2), 26 (5^0 + 5^2), 30 (5^1 + 5^2), etc.
 */
public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int magicNumber = findNthMagicNumber(n);
        System.out.println("The " + n + "th magic number is: " + magicNumber);
    }

    static int findNthMagicNumber(int n) {
        int magicNumber = 0;
        int powerOf5 = 1; // This will represent 5^i

        while (n > 0) {
            int lastBit = n & 1; // Get the last bit of n
            magicNumber += lastBit * powerOf5; // Add the contribution of the current bit
            powerOf5 *= 5; // Move to the next power of 5
            n >>= 1; // Right shift n to process the next bit
        }
        return magicNumber;
    }
}
