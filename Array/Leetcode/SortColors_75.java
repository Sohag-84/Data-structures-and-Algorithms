package Array.Leetcode;

import java.util.Arrays;

public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = { 5, 0, 2, 1, 1, 0 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
