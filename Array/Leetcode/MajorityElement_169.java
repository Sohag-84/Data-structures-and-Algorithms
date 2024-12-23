package Array.Leetcode;

//https://leetcode.com/problems/majority-element/description/

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println(majorityElement(nums));
        int result = majorElement(nums);
        System.out.println("Result: " + result);
    }

    // here I user moore's voting algorithim to solve the problem
    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            // set candidate
            // if candidate points(count) == 0
            // then new candidate will be select
            if (count == 0) {
                candidate = nums[i];
            }
            // update canditate points(count)
            // if same candidate found this time
            // candidate point will be increase
            // otherwise canditae point will be decrease

            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    /// solve problem using array sort
    /// but it show time limit exception
    /// when array is so long
    static int majorElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int start = 0;
        int end = nums.length;
        int mid = start + (end - start) / 2;
        return nums[mid];
    }

}
