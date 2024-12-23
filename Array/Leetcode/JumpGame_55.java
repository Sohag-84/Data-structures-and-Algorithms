package Array.Leetcode;

public class JumpGame_55 {
    public static void main(String[] args) {
        // int[] nums = { 3, 2, 1, 1, 4 };
        int[] nums = { 3, 2, 1, 0, 4 };
        System.out.println("Result: " + canJump(nums));
    }

    static boolean canJump(int[] nums) {
        int finalPosition = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}
