package maths.numbers;

public class Sieve {
    public static void main(String[] args) {
        int n = 50;
        boolean[] isComposites = new boolean[n + 1];
        sieve(n, isComposites);
    }

    public static void sieve(int n, boolean[] isComposite){
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
