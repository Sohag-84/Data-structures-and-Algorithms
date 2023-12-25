package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = { 1, 5, 3, -9, 0 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            // j always check [j]th index to left hand side
            // of the entire array. note: ==> j>0
            for (int j = i + 1; j > 0; j--) {
                // if arr[j] is smaller than arr[j-1] then swap
                // otherwise break the loop
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // swap two value
    static void swap(int arr[], int firstItem, int secondItem) {
        int temp = arr[firstItem];
        arr[firstItem] = arr[secondItem];
        arr[secondItem] = temp;
    }
}
