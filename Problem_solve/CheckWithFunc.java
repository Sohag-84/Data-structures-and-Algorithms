package Problem_solve;

import java.util.Scanner;

public class CheckWithFunc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            System.out.println(isArmstrongNumber(n));
        }
    }

    static boolean isArmstrongNumber(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum += cube;
            n /= 10;
        }
        return sum == original;
        // if (sum == original) {
        // return true;
        // } else {
        // return false;
        // }
    }
}
