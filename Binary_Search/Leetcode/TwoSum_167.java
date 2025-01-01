package Binary_Search.Leetcode;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSum_167 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        int firstIndex = -1;
        int lastIndex = -1;
        int first = 0;
        int last = n - 1;
        for (int i = 0; i < n; i++) {
            int pointerValue = nums[first] + nums[last];

            if (pointerValue > target) {
                last--;
            } else if (pointerValue < target) {
                first++;
            } else {
                firstIndex = first;
                lastIndex = last;
            }

        }
        for (int i = 0; i < 1; i++) {
            result[i] = firstIndex + 1;
            result[i + 1] = lastIndex + 1;
        }
        return result;
    }
}
