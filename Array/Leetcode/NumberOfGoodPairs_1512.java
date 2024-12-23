package Array.Leetcode;

//https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs_1512 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        int result = numIndenticalPairs(arr);
        System.out.println(result);
    }

    static int numIndenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
