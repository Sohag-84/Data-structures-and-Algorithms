package Problem_solve;

import java.util.Scanner;

public class LucasSeries {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms in Lucas series: ");
            int number = sc.nextInt();

            generateLucas(number);
        }

    }

    static void generateLucas(int number) {
        int first = 2;
        int second = 1;
        System.out.println("Lucas series up to " + number + " terms: ");
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= number; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
