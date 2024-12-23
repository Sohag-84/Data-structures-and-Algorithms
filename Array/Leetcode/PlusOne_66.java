package Array.Leetcode;

import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {

        int[] digits = { 9 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        int[] newArr = new int[digits.length + 1];

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        newArr[0] = 1;
        return newArr;
    }
}