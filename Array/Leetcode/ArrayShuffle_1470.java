package Array.Leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/

public class ArrayShuffle_1470 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };

        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int lenght = n;
        for (int i = 0; i < lenght; i++) {
            result[i + i] = nums[i];
            result[i + i + 1] = nums[n++];
        }
        return result;
    }
}
