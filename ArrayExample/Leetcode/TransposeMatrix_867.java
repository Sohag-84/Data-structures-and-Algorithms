package ArrayExample.Leetcode;

// https://leetcode.com/problems/transpose-matrix/description/

public class TransposeMatrix_867 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        int[][] result = transpose(matrix);
        int n = result.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();

        }

    }

    static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
}
