package Array.Leetcode;

// https://leetcode.com/problems/missing-number/description/

public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 3 };
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int n = nums.length;
        // calculate Nth number sumation
        int sum = (n * (n + 1) / 2);
        int aSum = 0;
        // calculate array value sumation
        for (int i = 0; i < n; i++) {
            aSum += nums[i];
        }
        return (sum - aSum);
    }
}
