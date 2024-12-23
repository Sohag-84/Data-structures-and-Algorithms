package Array.Leetcode;

import java.util.Arrays;

public class TwoSum_1 {
    public static void main(String[] args) {
        int arr[] = { 12, 7, 11, 2, 15 };
        int arr2[] = { 0, 1, 2, 5, 7, 9 };
        int target = 9;
        System.out.println("All types of array result: " + Arrays.toString(twoSum(arr, target)));
        System.out.println("Sorted array result: " + Arrays.toString(twoSum2(arr2, target)));
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

    // for only sorted array
    // return index;
    static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        int firstIndex = -1;
        int lastIndex = -1;
        int first = 0;
        int last = n - 1;
        for (int i = 0; i < n; i++) {
            int pointerValue = nums[first] + nums[last];

            if (pointerValue > target) {
                last--;
            } else if (pointerValue < target) {
                first++;
            } else {
                // if you want to return index
                firstIndex = first;
                lastIndex = last;

                // if you want to return value
                // firstIndex = nums[first];
                // lastIndex = nums[last];
            }

        }
        for (int i = 0; i < 1; i++) {
            result[i] = firstIndex;
            result[i + 1] = lastIndex;
        }
        return result;
    }
}
