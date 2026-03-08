package maths.bitwise.questions;

/**
 * Question: Find the sum of the nth row of Pascal's Triangle. The nth row of Pascal's Triangle is given by the binomial coefficients nC0, nC1, nC2, ..., nCn. The sum of these coefficients is equal to 2^n.
 */
public class SumOfNthRowOfPascalsTriangle {
    public static void main(String[] args) {
        int n = 4; // Row number (0-indexed)
        int sum = sumOfNthRow(n);
        System.out.println("The sum of the " + n + "th row of Pascal's Triangle is: " + sum);
    }

    static int sumOfNthRow(int n) {
        // Sum of each row in Pascal's Triangle is
        // nC0 + nC1 + nC2 + ... + nCn = 2^n
        // Since we are considering 0-indexed rows, the sum of the nth row is 2^(n-1)
        // For example, the sum of the 0th row (1) is 2^0 = 1, the sum of the 1st row (1, 1) is 2^1 = 2, the sum of the 2nd row (1, 2, 1) is 2^2 = 4, and so on.
        return 1 << (n - 1);
    }
}
