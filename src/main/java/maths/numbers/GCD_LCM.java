package maths.numbers;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4, 16));
        System.out.println(gcd(8, 16));
        System.out.println(lcm(4, 7));
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
