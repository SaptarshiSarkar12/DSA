package maths.bitwise.questions;

import static maths.bitwise.questions.XORFromZeroToA.xorFromZeroToA;

/**
 * Question: Given two integers a and b, find the XOR of all numbers from a to b (inclusive).
 */
public class XORInRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("XOR from " + a + " to " + b + " is: " + xorInRange(a, b));
    }

    static int xorInRange(int a, int b) {
        return xorFromZeroToA(b) ^ xorFromZeroToA(a - 1);
    }
}
