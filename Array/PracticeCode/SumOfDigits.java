package Array.PracticeCode;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int result = temp % 10;
            sum = sum + result;
            temp = temp / 10;
        }
        System.out.println("Result: " + sum);
    }
}
