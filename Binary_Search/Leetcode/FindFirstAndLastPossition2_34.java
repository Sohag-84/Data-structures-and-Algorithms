package Binary_Search.Leetcode;

import java.util.Arrays;

public class FindFirstAndLastPossition2_34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(nums, 7)));
    }

    static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        // for the first index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                break;
            }
        }

        // for the last index
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                last = i;
                break;
            }
        }

        int[] answer = new int[2];

        // for the answer
        for (int i = 0; i < answer.length - 1; i++) {
            answer[i] = first;
            answer[i + 1] = last;
        }
        return answer;

    }
}
