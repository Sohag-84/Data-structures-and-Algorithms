package Problem_solve;

import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        // int[][] matrix = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 }
        // };
        // int[][] matrix = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };
        int[][] matrix = {
                { 2, 3 }
        };
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int valueOfJ = 0;
        int valueOfI = 0;
        System.out.println("Length of array: " + matrix.length);
        if (matrix.length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                     result.add(matrix[i][j]);
                }
            }
            return result;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    valueOfJ = j;
                    result.add(matrix[i][j]);
                }
            }

        }

        /// add to top-1 to bottom
        // for (int i = 0; i < 1; i++) {
        for (int k = 1; k < matrix.length; k++) {
            valueOfI = k;
            System.out.println(k);
            result.add(matrix[k][valueOfJ]);
        }
        // }

        /// add right bottom-1 to left value
        for (int j = valueOfJ - 1; j >= 0; j--) {
            result.add(matrix[valueOfI][j]);
            valueOfJ = j;
        }

        /// add left bottom-1 to top-1
        for (int i = valueOfI - 1; i > 0; i--) {
            result.add(matrix[i][valueOfJ]);
            valueOfI--;
        }

        /// add middle left-1 to middle right-1
        for (int i = 1; i < matrix[0].length - 1; i++) {
            result.add(matrix[valueOfI][i]);
            valueOfJ++;
        }

        System.out.println("value of I: " + valueOfI);
        System.out.println("value of J: " + valueOfJ);
        return result;
    }
}
