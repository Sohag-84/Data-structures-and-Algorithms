package ArrayExample.Leetcode;

// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;
import java.util.List;

public class TargetArray_1389 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        int[] result = createTargetArray(nums, index);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < 1; j++) {
                temp.add(index[i], nums[i]);
            }
        }

        int[] target = new int[temp.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < temp.size(); i++) {
            target[i] = temp.get(i);
        }
        return target;

    }
}
