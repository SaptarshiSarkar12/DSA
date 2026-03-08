package maths.bitwise;

public class Main {
    public static void main(String[] args) {
        bitwiseAnd();
        bitwiseOr();
        bitwiseXor();
    }

    static void bitwiseAnd() {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result = a & b; // 0001 in binary, which is 1 in decimal
        System.out.println("Bitwise AND: " + result);
        System.out.println("AND operation can be used to check if the number is even or odd: " + (a & 1)); // 0101 & 0001 = 0001, which is 1 in decimal (odd)
        System.out.println("AND operation can be used to clear specific bits: " + (a & ~1)); // 0101 & 1110 = 0100, which is 4 in decimal (clears the least significant bit)
    }

    static void bitwiseOr() {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result = a | b; // 0111 in binary, which is 7 in decimal
        System.out.println("Bitwise OR: " + result);
    }

    static void bitwiseXor() {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result = a ^ b; // 0110 in binary, which is 6 in decimal
        System.out.println("Bitwise XOR: " + result);
        System.out.println("XOR of a number with itself is always 0: " + (a ^ a)); // 0000 in binary, which is 0 in decimal
        System.out.println("XOR of a number with 0 is the number itself: " + (a ^ 0)); // 0101 in binary, which is 5 in decimal
        System.out.println("XOR of a number with its complement is always -1: " + (a ^ ~a)); // 1111...1110 in binary, which is -1 in decimal
    }
}
