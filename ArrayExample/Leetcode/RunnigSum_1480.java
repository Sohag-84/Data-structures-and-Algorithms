package ArrayExample.Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunnigSum_1480 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 7, 4, 5 };
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
