package Array.PracticeCode;

import java.util.Scanner;

public class NoteCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notes = { 1000, 500, 100, 50, 10, 5, 1 };

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int[] noteCount = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            noteCount[i] = amount / notes[i];
            amount = amount % notes[i];
        }

        System.out.println("Number of notes:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCount[i] > 0) {
                System.out.println(notes[i] + " " + noteCount[i]);
            }
        }

        scanner.close();
    }
}
