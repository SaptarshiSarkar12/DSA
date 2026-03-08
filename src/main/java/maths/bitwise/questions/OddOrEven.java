package maths.bitwise.questions;

public class OddOrEven {
    public static void main(String[] args) {
        // Except the LSB, all other bits of any binary number are power of 2.
        // So, if we perform a bitwise AND operation between the number and 1,
        // we will get 0 for even numbers and 1 for odd numbers.
        int num = 5;
        isOddOrEven(num);
    }

    static void isOddOrEven(int num) {
        if ((num & 1) == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
