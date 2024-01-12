package CycleSort.Leetcode;

import java.util.Arrays;

public class SetMismatch_645 {
    public static void main(String[] args) {
        int nums[] = { 1, 1 };
        System.out.println("Result: " + Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
       // int arr[] = new int[2];
        int i = 0;
        while (i < nums.length) {
            int correctPosition = nums[i] - 1;
            if (nums[i] != nums[correctPosition]) {
                swap(nums, i, correctPosition);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (index + 1 != nums[index]) {
                return new int[] { nums[index], index + 1 };
                // for (int j = 0; j < arr.length - 1; j++) {
                // arr[j] = nums[index];
                // arr[j + 1] = index + 1;
                // }
            }
        }
        return new int[] { -1, -1 };
        // return arr;
    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
