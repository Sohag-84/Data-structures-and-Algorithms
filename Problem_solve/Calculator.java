package Problem_solve;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int result = 0;

            /// take input from user till doesn't press 'X' or 'x'
            while (true) {
                System.out.print("Enter operator: ");
                char op = sc.next().trim().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    // take input two number
                    System.out.print("Enter two number: ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    // perform operation
                    if (op == '+') {
                        result = num1 + num2;
                    }
                    if (op == '-') {
                        result = num1 - num2;
                    }
                    if (op == '*') {
                        result = num1 * num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Answer: Infinity\n");
                        }
                    }
                    if (op == '%') {
                        result = num1 % num2;
                    }

                    if (op != '/' || num2 != 0) {
                        System.out.println("Answer: " + result + "\n");
                    }
                }

                else if (op == 'x' || op == 'X') {
                    System.out.println("Programm closed");
                    break;
                } else {
                    System.out.println("Invalid operation\n\n");
                }
            }
        }

    }
}
