package CycleSort.Leetcode;

//https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNumber_287 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 2 };
        int result = findDuplicate(nums);
        System.out.println("Duplicate Number in this Array is: " + result);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currectPosition = nums[i] - 1;
            if (nums[i] != nums[currectPosition]) {
                swap(nums, i, currectPosition);
            } else {
                i++;
            }
        }
        // find duplicate value
        for (int index = 0; index < nums.length; index++) {
            if (index + 1 != nums[index]) {
                return nums[index];
            }
        }
        return -1;
    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
