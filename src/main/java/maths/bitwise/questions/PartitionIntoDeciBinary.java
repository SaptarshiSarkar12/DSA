package maths.bitwise.questions;

public class PartitionIntoDeciBinary {
    public static void main(String[] args) {
        String n = "32";
        System.out.println(minPartitions(n));
    }

    public static int minPartitions(String n) {
        int maxDigit = 0;
        for (char digit : n.toCharArray()) {
            maxDigit = Math.max(maxDigit, digit - '0');
        }
        return maxDigit;
    }
}
