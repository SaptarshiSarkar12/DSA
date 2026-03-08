package maths.bitwise.questions;

public class PrimeSetBits {
    public static void main(String[] args) {
        int left = 10;
        int right = 15;
        System.out.println(countPrimeSetBits(left, right));
        System.out.println((int) -2.968);
    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int numOfSetBits = countSetBits(i);
            if (isPrime(numOfSetBits)) {
                count++;
            }
        }
        return count;
    }

    public static int countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            num &= num - 1;
            count++;
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
