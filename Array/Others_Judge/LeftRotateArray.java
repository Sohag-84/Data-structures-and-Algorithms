package Array.Others_Judge;

// https://www.naukri.com/code360/problems/left-rotate-an-array-by-one_5026278?leftPanelTabValue=PROBLEM

import java.util.*;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(rotateArray(arr, arr.length)));
    }

    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        return arr;
    }
}
