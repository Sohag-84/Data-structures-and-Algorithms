package CycleSort.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberList_442 {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> list = findDuplicates(nums);
        System.out.println("Duplicate number List: " + list);
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currectIndex = nums[i] - 1;
            if (nums[i] != nums[currectIndex]) {
                swap(nums, i, currectIndex);
            } else {
                i++;
            }
        }
        List<Integer> duplicateList = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (index + 1 != nums[index]) {
                duplicateList.add(nums[index]);
            }
        }
        return duplicateList;
    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
