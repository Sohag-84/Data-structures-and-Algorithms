package ArmStrongNumber;

public class ThreeDigitArmstrongNumber {
    public static void main(String[] args) {

        // Three digit armstrong number from 100 to 1000
        for (int i = 100; i < 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
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
    }
}
