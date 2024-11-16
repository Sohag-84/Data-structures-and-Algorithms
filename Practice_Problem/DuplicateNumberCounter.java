package Practice_Problem;

import java.util.Scanner;

public class DuplicateNumberCounter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your target number: ");
            int target = sc.nextInt();
            int number = 1234221;
            int counter = 0;

            while (number > 0) {
                if (number % 10 == target) {
                    counter++;
                }
                number = number / 10;
            }
            System.out.println(counter);
        }
    }
}
