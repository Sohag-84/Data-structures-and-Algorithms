package Array.Leetcode;

public class HouseRobber_198 {
    public static void main(String[] args) {

    }

    static int rob(int[] nums) {

        //if only 1 element, just return it
        if(nums.length<2){
            return nums[0];
        }

        //create array to store maximum loot at each index
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            //main logic to solve this problem
            dp[i] = Math.max((dp[i - 2] + nums[i]), dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
