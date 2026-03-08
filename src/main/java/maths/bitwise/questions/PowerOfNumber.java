package maths.bitwise.questions;

/**
 * Question: Given two integers a and b, find the value of a raised to the power of b (a^b) using bitwise operations.
 */
public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 16;
        int power = 4;
        System.out.println(findPower(base, power));
    }

    static int findPower(int base, int power) {
        int result = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                result *= base; // If the least significant bit of power is 1, multiply result by base
            }
            power >>= 1; // Right shift power by 1 (divide by 2)
            base *= base; // Square base
        }
        return result;
    }
}
