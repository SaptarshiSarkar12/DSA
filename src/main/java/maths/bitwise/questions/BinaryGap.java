package maths.bitwise.questions;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 1041;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(binaryGap(n));
    }

    public static int binaryGap(int n) {
        int maxDistance = 0;
        int previousPosition = -1;
        int nextPosition = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                if (previousPosition != -1) {
                    maxDistance = Math.max(maxDistance, nextPosition - previousPosition);
                }
                previousPosition = nextPosition;
            }
            n >>= 1;
            nextPosition++;
        }
        return maxDistance;
    }
}
