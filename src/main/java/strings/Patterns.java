package strings;

public class Patterns {
    public static void main(String[] args) {
        pattern28(5);
        pattern30(5);
        pattern17(5);
        pattern31(4);
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2 * n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int valueAtEveryIndex = 1 + originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(valueAtEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfSpaces = row > n ? row - n : n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            int c = row > n ? 2 * n - row : row;
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
