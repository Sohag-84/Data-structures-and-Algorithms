package ArrayExample.Leetcode;

import java.util.*;

public class ArrayIntersection_349 {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!result.contains(nums1[i])) {
                        result.add(nums1[i]);
                    }
                }
            }
        }
        int[] newArr = new int[result.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = result.get(i);
        }
        return newArr;
    }
}
