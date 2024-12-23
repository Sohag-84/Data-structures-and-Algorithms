package Array.Leetcode;

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3 };
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
