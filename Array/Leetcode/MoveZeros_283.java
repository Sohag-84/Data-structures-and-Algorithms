package Array.Leetcode;

//https://leetcode.com/problems/move-zeroes/description/

import java.util.*;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void moveZeroes(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp.add(nums[i]);
            }
        }
        int tempSize = temp.size();
        for (int i = 0; i < tempSize; i++) {
            nums[i] = temp.get(i);
        }
        for (int i = tempSize; i < nums.length; i++) {
            nums[i] = 0;
        }
        // System.out.println(temp);
    }
}
