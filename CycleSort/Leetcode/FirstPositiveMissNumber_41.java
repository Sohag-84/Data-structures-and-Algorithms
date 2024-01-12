package CycleSort.Leetcode;

//https://leetcode.com/problems/first-missing-positive/description/
//microsoft question

public class FirstPositiveMissNumber_41 {
    public static void main(String[] args) {
        int nums[] = { 3, 4, -1, 1 };
        int result = firstMissingPositive(nums);
        System.out.println("Missing Number in this Array is: " + result);
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            int correctPosition = nums[i] - 1;
            if (nums[i] > 0 & nums[i] < nums.length && nums[i] != nums[correctPosition]) {
                swap(nums, i, correctPosition);
            } else {
                i++;
            }
        }
        // search first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
