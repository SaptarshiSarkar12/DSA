package arrays.search_algorithms.binary_search;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] m = {
                {2, 16, 18, 40},
                {24, 26, 32, 49},
                {44, 45, 52, 60},
                {56, 61, 65, 79}
        };
        int target = 32;
        System.out.println(Arrays.toString(searchMatrix(m, target)));
    }

    static int[] searchMatrix(int[][] matrix, int target) {
        int r = 0;
        // "matrix.length" returns the number of rows but in our case of a square matrix,
        // equal number of rows and columns are present
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
