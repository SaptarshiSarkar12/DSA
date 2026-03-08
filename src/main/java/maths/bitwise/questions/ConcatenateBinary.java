package maths.bitwise.questions;

public class ConcatenateBinary {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(concatenateBinary(n));
    }

    public static int concatenateBinary(int n) {
        long ans = 0;
        int mod = 1_000_000_007;
        int length = 0; // To keep track of the length of the binary representation of the current number
        for (int i = 1; i <= n; i++) {
            // If i is a power of 2, its binary length increases by 1
            if ((i & (i - 1)) == 0) {
                length++;
            }
            ans = (ans << length | i) % mod;
            // Explanation:
            // 1. We calculate the length of the binary representation of i using Integer.toBinaryString(i).length().
            // 2. We left shift ans by the length of the binary representation of i to make space for the new number.
            // 3. We add i to ans and take modulo mod to keep the result within bounds.
        }
        return (int) ans;
    }
}
