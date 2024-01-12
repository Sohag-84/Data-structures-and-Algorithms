package ArrayExample;

import java.util.Scanner;

public class SwapValueWithoutTemporayVariabl {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int x = sc.nextInt();
            System.out.print("Enter the second number: ");
            int y = sc.nextInt();

            // swap two variable value
            x = x + y;
            y = x - y;
            x = x - y;

            System.out.println("After swap:\nX=" + x + "\nY=" + y);
        }

    }
}
