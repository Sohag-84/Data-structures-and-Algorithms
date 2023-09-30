package ArrayExample.Leetcode;

//https://leetcode.com/problems/rotate-array/

public class RotetArray_189 {
    public static void main(String[] args) {

    }

    static void rotate(int nums[], int k) {
        int n = nums.length;

        // if the k's lenght greater than array length
        if (k >= n) {
            k = k % n;
        }

        int ans[] = new int[n];
        int arrayIndex = 0;

        // Items before the kth position
        for (int i = 0; i < n - k; i++) {
            ans[arrayIndex++] = nums[i];
        }

        // Items after the kth position
        for (int i = n - k; i < n; i++) {
            ans[arrayIndex++] = nums[i];
        }

        System.arraycopy(ans, 0, nums, 0, ans.length);
    }
}
