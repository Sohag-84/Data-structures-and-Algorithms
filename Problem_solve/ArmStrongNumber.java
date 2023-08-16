package Problem_solve;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int original = n;
            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                int cube = (rem * rem * rem);
                sum += cube;
                n /= 10;
            }
            if (sum == original) {
                System.out.println("Number is armstrong number");
            } else {
                System.out.println("Number is not armstrong number");
            }
        }
    }
}
