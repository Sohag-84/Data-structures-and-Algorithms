package Leetcode_Problem;

import java.util.Scanner;

public class BalanceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = "24123";
        System.out.println(isBalanced(num));
        sc.close();
    }

    static boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                evenSum += Integer.parseInt(String.valueOf(num.charAt(i)));
            } else {
                oddSum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }

        }
        if (evenSum == oddSum) {
            return true;
        } else {
            return false;
        }
    }
}
