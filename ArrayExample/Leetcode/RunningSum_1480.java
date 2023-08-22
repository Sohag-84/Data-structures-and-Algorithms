package ArrayExample.Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum_1480 {
    public static void main(String[] args) {

        int[] arr = { 3,1,2,10,1 };

        System.out.println(Arrays.toString(runningSum(arr)));

    }

    static int[] runningSum(int[] nums) {
        int result[] = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < result.length; i++) {
            sum = sum + nums[i];
            result[i] = sum;
        }

        return result;
    }
}