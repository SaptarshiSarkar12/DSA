package maths.bitwise.questions;

/**
 * Question: Given an integer A, find the XOR of all the numbers from 0 to A.
 */
public class XORFromZeroToA {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("XOR from 0 to " + a + " is: " + xorFromZeroToA(a));
    }

    static int xorFromZeroToA(int a) {
        int mod = a % 4;
        if (mod == 0) {
            return a;
        } else if (mod == 1) {
            return 1;
        } else if (mod == 2) {
            return a + 1;
        } else {
            return 0;
        }
    }
}
