package Array.PracticeCode;

import java.util.Scanner;

public class ExistingValueCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the search number: ");
            int arr[] = { 12, 4, 5, 98, 90, 23 };
            int searchNumber = sc.nextInt();
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == searchNumber) {
                    count = 1;
                    System.out.println("Find found element at " + i + " index");
                }
            }
            if (count == 0) {
                System.out.println("Element not found");
            }
        }
    }
}
