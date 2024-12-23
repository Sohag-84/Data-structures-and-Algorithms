package Array.Leetcode;

import java.util.Arrays;

public class RotateArray_189 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] ans = new int[n];

        for (int i = n - k; i < n; i++) {
            ans[i - (n - k)] = nums[i];
        }
        for (int i = k; i < n; i++) {
            ans[i] = nums[i - k];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }
}
