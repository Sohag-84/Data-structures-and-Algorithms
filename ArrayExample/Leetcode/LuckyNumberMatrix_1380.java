package ArrayExample.Leetcode;

import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

public class LuckyNumberMatrix_1380 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 10, 4, 2 },
                { 9, 3, 8, 7 },
                { 15, 16, 17, 12 }
        };
        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        for (int row = 0; row < matrix.length; row++) {
            int minInRow = Integer.MAX_VALUE;
            int lowestIndex = 0;

            // find the lowest value and value index
            for (int col = 0; col < matrix[row].length; col++) {
                if (minInRow > matrix[row][col]) {
                    minInRow = matrix[row][col];
                    lowestIndex = col;
                }
            }
            int maxInCol = Integer.MIN_VALUE;
            /// find the highest value in the column of lowest value
            for (int k = 0; k < matrix.length; k++) {
                if (maxInCol < matrix[k][lowestIndex]) {
                    maxInCol = matrix[k][lowestIndex];
                }
            }
            // System.out.println("Min in Row: " + minInRow);
            // System.out.println("Max in Col: " + maxInCol);

            // check if the lowest value in the row is equal to
            // the highest value in the column
            if (minInRow == maxInCol) {
                result.add(maxInCol);
            }
        }
        return result;
    }

}
