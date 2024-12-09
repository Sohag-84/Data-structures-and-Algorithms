package ArrayExample.Leetcode;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class SmallerThanCurrentNumber_1365 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            //System.out.println(nums[i] + " : " + count);
            temp[i] = count;
        }
        return temp;
    }
}
