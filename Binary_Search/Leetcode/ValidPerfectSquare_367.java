package Binary_Search.Leetcode;

// https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare_367 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid < (long) num) {
                left = mid + 1;
            } else if ((long) mid * mid > (long) num) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
