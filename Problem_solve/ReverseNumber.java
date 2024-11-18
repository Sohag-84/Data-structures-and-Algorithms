package Problem_solve;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 28749;
        while (num > 0) {
            int remainer = num % 10;
            System.out.print(remainer);
            num = num / 10;
        }
        System.out.println();

        // way-2 to reverse the number
        int number = 342154;
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reverse result is: " + ans);

        // way-3 to reverse the number
        int n = 12345;
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        System.out.println("result" + sb.reverse());
    }
}
