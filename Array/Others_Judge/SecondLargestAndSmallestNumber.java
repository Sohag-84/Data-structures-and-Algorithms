package Array.Others_Judge;

///https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960

import java.util.*;

public class SecondLargestAndSmallestNumber {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        System.out.println(Arrays.toString(getSecondOrderElements(a.length, a)));
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int sLargest = getSecondLargest(a, n);
        int sSmallest = getSecondSmallest(a, n);
        int[] result = new int[2];
        result[0] = sLargest;
        result[1] = sSmallest;
        return result;
    }

    static int getSecondLargest(int[] arr, int n) {
        int max = arr[0];
        int secondMax = -1;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            }
            if (max > arr[i] && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    static int getSecondSmallest(int[] arr, int n) {
        int small = arr[0];
        int secondSmall = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (small > arr[i]) {
                secondSmall = small;
                small = arr[i];
            }
            if (small != arr[i] && secondSmall > arr[i]) {
                secondSmall = arr[i];
            }
        }

        return secondSmall;
    }
}
