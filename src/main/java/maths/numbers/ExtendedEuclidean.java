package maths.numbers;

public class ExtendedEuclidean {
    static int gcdExtended(int a, int b, int[] xy) {
        if (a == 0) {
            xy[0] = 0; // x
            xy[1] = 1; // y
            return b;
        }

        int[] temp = new int[2];
        int gcd = gcdExtended(b % a, a, temp);

        // Update x and y using results of recursion
        xy[0] = temp[1] - (b / a) * temp[0];
        xy[1] = temp[0];

        return gcd;
    }

    public static void main(String[] args) {
        int a = 514, b = 106;
        int[] xy = new int[2];

        int gcd = gcdExtended(a, b, xy);

        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("Coefficients: x = " + xy[0] + ", y = " + xy[1]);
        System.out.println(a + "*" + xy[0] + " + " + b + "*" + xy[1] + " = " + gcd);
    }
}
