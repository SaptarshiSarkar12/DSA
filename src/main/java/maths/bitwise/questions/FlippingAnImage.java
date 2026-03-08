package maths.bitwise.questions;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] flippedImage = flipAndInvertImage(image);
        for (int[] row : flippedImage) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse the array along with XOR
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
        return image;
    }
}
