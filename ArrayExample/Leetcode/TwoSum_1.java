package ArrayExample.Leetcode;

import java.util.Arrays;

public class TwoSum_1 {
    public static void main(String[] args) {
        int arr[] = { 12, 7, 11, 2, 15 };
        int target = 9;
        System.out.println("result: " + Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int answer[] = new int[2];
        int firstIndex = -1;
        int secondIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        for (int i = 0; i < answer.length - 1; i++) {
            answer[i] = firstIndex;
            answer[i + 1] = secondIndex;
        }
        return answer;
    }

}
