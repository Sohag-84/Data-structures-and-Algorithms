package Array.PracticeCode;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 5 numbers: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
