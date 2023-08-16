package Problem_solve.First_java;

import java.util.Scanner;

//Write a program to print whether a number is 
//even or odd, also take input from the user.
public class EvenOddNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstNum = sc.nextInt();

            if (firstNum % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
