package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 56, -7, 0, 3 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array
            // and swap with correct index
            int last = arr.length - i - 1; // for last postion to swap
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    // for swap item
    static void swap(int arr[], int firstItem, int secondItem) {
        int temp = arr[firstItem];
        arr[firstItem] = arr[secondItem];
        arr[secondItem] = temp;
    }

    // for maximum index item
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
