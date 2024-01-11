package ArrayExample;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1823;
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int result = temp % 10;
            sum = sum * 10 + result;
            temp = temp / 10;
        }
        System.out.println("Result: " + sum);
    }
}
