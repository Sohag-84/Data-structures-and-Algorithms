package Array.Leetcode;

public class PalindromNumber_9 {
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }

    static boolean isPalindrome(int x) {
        int palindromNumber = 0;
        int temp = x;
        while (temp != 0) {
            int result = temp % 10;
            palindromNumber = palindromNumber * 10 + result;
            temp = temp / 10;
        }
        // check palindrom or not
        if (x >= 0 & x == palindromNumber) {
            return true;
        }
        return false;
    }
}
