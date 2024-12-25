package Array.Leetcode;

//https://leetcode.com/problems/move-zeroes/description/

// https://www.naukri.com/code360/problems/ninja-and-the-zero-s_6581958?leftPanelTabValue=PROBLEM

import java.util.*;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    // optimal solution
    // using 2 pointer
    static void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return;
        }
        for (int i = j; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    /// brute force approace
    static void moveZeroes2(int[] nums) {
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
