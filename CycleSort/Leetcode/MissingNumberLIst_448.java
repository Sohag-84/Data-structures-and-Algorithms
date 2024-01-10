package CycleSort.Leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//google question

public class MissingNumberLIst_448 {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println("Missing number List: " + list);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currectIndex = nums[i] - 1;
            if (nums[i] != nums[currectIndex]) {
                swap(nums, i, currectIndex);
            } else {
                i++;
            }
        }
        // find missing number list
        List<Integer> missingNumberList = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (index + 1 != nums[index]) {
                missingNumberList.add(index + 1);
            }
        }
        return missingNumberList;
    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
