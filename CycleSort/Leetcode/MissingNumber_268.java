package CycleSort.Leetcode;

//https://leetcode.com/problems/missing-number/
//amazon quetion

public class MissingNumber_268 {
    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        int result = missingNumber(nums);
        System.out.println("Missing Number in this Array is: " + result);
    }

    // array value contains 0-N
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctPosition = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctPosition]) {
                swap(nums, i, correctPosition);
            } else {
                i++;
            }
        }
        // search first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int nums[], int firstItem, int secondItem) {
        int temp = nums[firstItem];
        nums[firstItem] = nums[secondItem];
        nums[secondItem] = temp;
    }
}
