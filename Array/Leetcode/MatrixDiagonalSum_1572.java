package Array.Leetcode;

public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int result = diagonalSum(mat);
        System.out.println(result);
    }

    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += mat[i][j];
                }
                if ((i + j) == (n - 1)) {
                    if (i != j) {
                        sum += mat[i][j];
                    }
                }
            }
        }
        return sum;
    }
}
