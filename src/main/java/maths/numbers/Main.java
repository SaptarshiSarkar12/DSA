package maths.numbers;

public class Main {
    public static void main(String[] args) {
        int n = 50;
        displayAllPrimes(n);
    }

    public static void displayAllPrimes(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
