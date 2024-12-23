package Array.PracticeCode;

import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of column: ");
            int colSize = sc.nextInt();

            System.out.print("Enter the size of row: ");
            int rowSize = sc.nextInt();
            int arr[][] = new int[rowSize][colSize];

            // input array
            System.out.println("Enter the array: ");
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = sc.nextInt();
                }
            }

            // print array
            System.out.println("\nArray Item: ");
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }
        }
    }
}
