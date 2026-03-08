package maths.bitwise.questions;

/**
 * Question: Given a number n and a base b, find the number of digits required to represent n in base b.
 * For example, if n = 100 and b = 2, the output should be 7 because 100 in binary is 1100100, which has 7 digits.
 */
public class NumberOfDigitsInBase {
    public static void main(String[] args) {
        int n = 100;
        int base = 2;
        int digits = numberOfDigitsInBase(n, base);
        System.out.println("Number of digits required to represent " + n + " in base " + base + " is: " + digits);
    }

    static int numberOfDigitsInBase(int n, int base) {
        // log base b of n is log(n) / log(b)
        return (int) (Math.log(n) / Math.log(base)) + 1;
    }
}
