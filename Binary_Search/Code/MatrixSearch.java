package Binary_Search.Code;

import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 30, 40, 50, 60 },
        };
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
}
