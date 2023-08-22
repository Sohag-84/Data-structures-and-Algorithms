package ArrayExample.Leetcode;

import java.util.Arrays;

//pb:-> https://leetcode.com/problems/concatenation-of-array/description/

public class ArrayConcatination_1929 {
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,6 };

        System.out.println(Arrays.toString(getConcatenation2(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);

        return result;
    }

    static int[] getConcatenation2(int[] nums) {
        int[] result = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + (nums.length)] = nums[i];
        }
        return result;
    }

}
