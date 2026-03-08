package maths.numbers;

public class NewtonRaphsonSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(43));
    }

    public static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.5) { // Error threshold, can be adjusted for more precision
                break;
            }
            x = root;
        }
        return root;
    }
}
