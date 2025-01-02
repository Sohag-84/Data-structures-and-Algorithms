package Array.Leetcode;

public class SpecialArray_1608 {
    public static void main(String[] args) {
        int[] nums = { 0, 4, 3, 0, 4 };
        System.out.println(specialArray(nums));
    }

    static int specialArray(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }
        return -1;
    }
}
